
package com.oa.rest.stub.service3;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "areaoffered",
    "officefacing",
    "parking",
    "efficiency",
    "floortoceilinght",
    "propertytype",
    "workstationtype",
    "furnished",
    "bldgmgrdetails"
})
public class Availablespace {

    @JsonProperty("areaoffered")
    private String areaoffered;
    @JsonProperty("officefacing")
    private String officefacing;
    @JsonProperty("parking")
    private Parking parking;
    @JsonProperty("efficiency")
    private String efficiency;
    @JsonProperty("floortoceilinght")
    private String floortoceilinght;
    @JsonProperty("propertytype")
    private String propertytype;
    @JsonProperty("workstationtype")
    private String workstationtype;
    @JsonProperty("furnished")
    private Furnished furnished;
    @JsonProperty("bldgmgrdetails")
    private Bldgmgrdetails bldgmgrdetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The areaoffered
     */
    @JsonProperty("areaoffered")
    public String getAreaoffered() {
        return areaoffered;
    }

    /**
     * 
     * @param areaoffered
     *     The areaoffered
     */
    @JsonProperty("areaoffered")
    public void setAreaoffered(String areaoffered) {
        this.areaoffered = areaoffered;
    }

    /**
     * 
     * @return
     *     The officefacing
     */
    @JsonProperty("officefacing")
    public String getOfficefacing() {
        return officefacing;
    }

    /**
     * 
     * @param officefacing
     *     The officefacing
     */
    @JsonProperty("officefacing")
    public void setOfficefacing(String officefacing) {
        this.officefacing = officefacing;
    }

    /**
     * 
     * @return
     *     The parking
     */
    @JsonProperty("parking")
    public Parking getParking() {
        return parking;
    }

    /**
     * 
     * @param parking
     *     The parking
     */
    @JsonProperty("parking")
    public void setParking(Parking parking) {
        this.parking = parking;
    }

    /**
     * 
     * @return
     *     The efficiency
     */
    @JsonProperty("efficiency")
    public String getEfficiency() {
        return efficiency;
    }

    /**
     * 
     * @param efficiency
     *     The efficiency
     */
    @JsonProperty("efficiency")
    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    /**
     * 
     * @return
     *     The floortoceilinght
     */
    @JsonProperty("floortoceilinght")
    public String getFloortoceilinght() {
        return floortoceilinght;
    }

    /**
     * 
     * @param floortoceilinght
     *     The floortoceilinght
     */
    @JsonProperty("floortoceilinght")
    public void setFloortoceilinght(String floortoceilinght) {
        this.floortoceilinght = floortoceilinght;
    }

    /**
     * 
     * @return
     *     The propertytype
     */
    @JsonProperty("propertytype")
    public String getPropertytype() {
        return propertytype;
    }

    /**
     * 
     * @param propertytype
     *     The propertytype
     */
    @JsonProperty("propertytype")
    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    /**
     * 
     * @return
     *     The workstationtype
     */
    @JsonProperty("workstationtype")
    public String getWorkstationtype() {
        return workstationtype;
    }

    /**
     * 
     * @param workstationtype
     *     The workstationtype
     */
    @JsonProperty("workstationtype")
    public void setWorkstationtype(String workstationtype) {
        this.workstationtype = workstationtype;
    }

    /**
     * 
     * @return
     *     The furnished
     */
    @JsonProperty("furnished")
    public Furnished getFurnished() {
        return furnished;
    }

    /**
     * 
     * @param furnished
     *     The furnished
     */
    @JsonProperty("furnished")
    public void setFurnished(Furnished furnished) {
        this.furnished = furnished;
    }

    /**
     * 
     * @return
     *     The bldgmgrdetails
     */
    @JsonProperty("bldgmgrdetails")
    public Bldgmgrdetails getBldgmgrdetails() {
        return bldgmgrdetails;
    }

    /**
     * 
     * @param bldgmgrdetails
     *     The bldgmgrdetails
     */
    @JsonProperty("bldgmgrdetails")
    public void setBldgmgrdetails(Bldgmgrdetails bldgmgrdetails) {
        this.bldgmgrdetails = bldgmgrdetails;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
