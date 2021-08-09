package api.salesforce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceBook {
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("IsStandard")
    public Boolean isStandard;
    @JsonProperty("IsActive")
    public String isActive;

    /**
     * Gets the isStandard value.
     *
     * @return the isStandard.
     */
    public Boolean getStandard() {
        return isStandard;
    }
    /**
     * Sets the newName.
     *
     * @param standard .
     */
    public void setStandard(final Boolean standard) {
        isStandard = standard;
    }
    /**
     * Gets the isActive value.
     *
     * @return the isActive.
     */
    public String getActive() {
        return isActive;
    }

    /**
     * Sets the newName.
     *
     * @param newIsActive .
     */
    public void setActive(final String newIsActive) {
        this.isActive = newIsActive;
    }

    /**
     * Gets the id.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }
    /**
     * Sets the id.
     *
     * @param  newId .
     */
    public void setId(final String newId) {
        this.id = newId;
    }
    /**
     * Gets the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the newName.
     *
     * @param newName .
     */
    public void setName(final String newName) {
        this.name = newName;
    }
}
