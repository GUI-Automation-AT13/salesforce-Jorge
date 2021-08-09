package salesforce.ui.pages.lightning.contracts;

import core.selenium.WebDriverManager;
import salesforce.ui.utils.GetString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractDetails extends CreatedContractPage {
    private static final String BASE_XPATH = "//div[./div[./span[text()='%s']]]";
    private static final HashMap<String, String> XPATH_COMPLEMENTS = new HashMap<>();

    static {
        XPATH_COMPLEMENTS.put("Contract Owner", "//a");
        XPATH_COMPLEMENTS.put("Status", "//span//span");
        XPATH_COMPLEMENTS.put("Account Name", "//a");
        XPATH_COMPLEMENTS.put("Contract End Date", "//span//span");
        XPATH_COMPLEMENTS.put("Customer Signed By", "//a");
        XPATH_COMPLEMENTS.put("Contract Term (months)", "//span//span");
        XPATH_COMPLEMENTS.put("Customer Signed Title", "//span//span");
        XPATH_COMPLEMENTS.put("Owner Expiration Notice", "//span//span");
        XPATH_COMPLEMENTS.put("Customer Signed Date", "//span//span");
        XPATH_COMPLEMENTS.put("Company Signed By", "//button/preceding-sibling::span");
        XPATH_COMPLEMENTS.put("Price Book", "//a");
        XPATH_COMPLEMENTS.put("Company Signed Date", "//button/preceding-sibling::span");
        XPATH_COMPLEMENTS.put("Special Terms", "//span//span");
        XPATH_COMPLEMENTS.put("Description", "//span//span");
    }

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public ContractDetails(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }
    /**
     * Gets the text inside the element.
     *
     * @param field
     * @return the text set on the field requested contract.
     */
    public String getTextByField(final String field) {
        String xpathComplement = XPATH_COMPLEMENTS.get(field);
        String xpath = String.format(BASE_XPATH, field).concat(xpathComplement);
        return webElementAction.getTextOfElementByField(xpath);
    }
    /**
     * Gets text fields of workType.
     *
     * @return a list with the values set on the page's fields.
     * @param table .
     */
    public List<String> getDetailsList(final Map<String, String> table) {
        List<String> result = new ArrayList<>();
        HashMap<String, GetString> actionsCreatedMap = getTxtFields();
        table.keySet().forEach(key -> result.add(actionsCreatedMap.get(key).getString()));
        return result;
    }
    /**
     * Gets text fields of workType.
     *
     * @return a map with methods of CreatedWorkType
     */
    private HashMap<String, GetString> getTxtFields() {
        HashMap<String, GetString> mapValues = new HashMap<>();
        mapValues.put("Account Name", () -> getTextByField("Account Name"));
        mapValues.put("Contract Term (months)", () -> getTextByField("Contract Term (months)"));
        mapValues.put("Contract Start Date", this::contractStartDateText);
        mapValues.put("Customer Signed By", () -> getTextByField("Customer Signed By"));
        mapValues.put("Customer Signed Title", () -> getTextByField("Customer Signed Title"));
        mapValues.put("Customer Signed Date", () -> getTextByField("Customer Signed Date"));
        mapValues.put("Price Book", () -> getTextByField("Price Book"));
        mapValues.put("Owner Expiration Notice", () -> getTextByField("Owner Expiration Notice"));
        mapValues.put("Company Signed Date", () -> getTextByField("Company Signed Date"));
        mapValues.put("Special Terms", () -> getTextByField("Special Terms"));
        mapValues.put("Description", () -> getTextByField("Description"));
        return mapValues;
    }
}
