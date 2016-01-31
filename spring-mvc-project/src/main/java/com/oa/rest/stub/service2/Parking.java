
package com.oa.rest.stub.service2;

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
    "parkingfloors",
    "noofcars",
    "notes"
})
public class Parking {

    @JsonProperty("parkingfloors")
    private String parkingfloors;
    @JsonProperty("noofcars")
    private String noofcars;
    @JsonProperty("notes")
    private String notes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The parkingfloors
     */
    @JsonProperty("parkingfloors")
    public String getParkingfloors() {
        return parkingfloors;
    }

    /**
     * 
     * @param parkingfloors
     *     The parkingfloors
     */
    @JsonProperty("parkingfloors")
    public void setParkingfloors(String parkingfloors) {
        this.parkingfloors = parkingfloors;
    }

    /**
     * 
     * @return
     *     The noofcars
     */
    @JsonProperty("noofcars")
    public String getNoofcars() {
        return noofcars;
    }

    /**
     * 
     * @param noofcars
     *     The noofcars
     */
    @JsonProperty("noofcars")
    public void setNoofcars(String noofcars) {
        this.noofcars = noofcars;
    }

    /**
     * 
     * @return
     *     The notes
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * 
     * @param notes
     *     The notes
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
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
