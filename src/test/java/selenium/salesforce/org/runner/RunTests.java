package selenium.salesforce.org.runner;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import api.salesforce.ApiEndPoints;
import api.salesforce.Authentication;
import api.salesforce.entities.Account;
import api.salesforce.entities.Contact;
import api.salesforce.entities.PriceBook;
import api.salesforce.entities.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.utils.PropertiesReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Properties;

import static api.salesforce.Authentication.token;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"html:target/site/cucumber-pretty.html", "json:target/cucumber.json"},
        glue = {"selenium.salesforce.org"}
)
public class RunTests extends AbstractTestNGCucumberTests {
    public ApiRequest apiRequest;
    public ApiResponse apiResponse;
    public Authentication authentication = new Authentication();
    public Account account;
    public Contact contact;
    public PriceBook priceBook;

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }
    @BeforeClass
    public void loginAndSetup() throws JsonProcessingException {
        apiLogin();
        createAccount();
        createContact();
        createPriceBook();
        activatePriceBook();
    }

    @AfterClass
    public void afterExecution() {
        apiRequest.clearBody();
        deleteAccount();
        deleteContact();
        deletePriceBook();
    }
    public void apiLogin(){
        apiRequest = new ApiRequest();
        Properties properties = PropertiesReader.getProperties("config.properties");
        authentication.getAuth();
        apiRequest.addHeader("Content-Type", "application/json")
                .addHeader(HttpHeaders.AUTHORIZATION, token.getTokenType() + " " + token.getAccessToken())
                .setBaseUri(token.getInstanceUrl() + properties.getProperty("SERVICE")
                        + properties.getProperty("VERSION"));
    }

    public void createAccount() throws JsonProcessingException {
        account = new Account();
        account.setName("TestAccount");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
        account.setId(apiResponse.getBody(Response.class).getId());
    }

    public void createContact() throws JsonProcessingException {
        contact = new Contact();
        contact.setLastName("TestContact");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.CONTACT)
                .body(new ObjectMapper().writeValueAsString(contact));

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
        contact.setId(apiResponse.getBody(Response.class).getId());
    }

    public void createPriceBook() throws JsonProcessingException {
        priceBook = new PriceBook();
        priceBook.setName("Standard");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.PRICEBOOK)
                .body(new ObjectMapper().writeValueAsString(priceBook));
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        priceBook.setId(apiResponse.getBody(Response.class).getId());
    }
    public void activatePriceBook() throws JsonProcessingException {
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiEndPoints.PRICEBOOK_ID)
                .addPathParam("PRICEBOOK_ID", priceBook.getId())
                .body("{\"IsActive\": \"true\"}");
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
    }

    public void deleteAccount() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.ACCOUNT_ID)
                .addPathParam("ACCOUNT_ID", account.getId());

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    public void deleteContact() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.CONTACT_ID)
                .addPathParam("CONTACT_ID", contact.getId());

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
    public void deletePriceBook() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.PRICEBOOK_ID)
                .addPathParam("PRICEBOOK_ID", priceBook.getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
    }
}
