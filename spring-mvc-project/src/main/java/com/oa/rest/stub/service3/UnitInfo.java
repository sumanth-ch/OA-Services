
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
    "propertyid",
    "floorno",
    "unitno",
    "occupied",
    "occupiedspace",
    "availablespace"
})
public class UnitInfo {

    @JsonProperty("propertyid")
    private String propertyid;
    @JsonProperty("floorno")
    private String floorno;
    @JsonProperty("unitno")
    private String unitno;
    @JsonProperty("occupied")
    private String occupied;
    @JsonProperty("occupiedspace")
    private Occupiedspace occupiedspace;
    @JsonProperty("availablespace")
    private Availablespace availablespace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The propertyid
     */
    @JsonProperty("propertyid")
    public String getPropertyid() {
        return propertyid;
    }

    /**
     * 
     * @param propertyid
     *     The propertyid
     */
    @JsonProperty("propertyid")
    public void setPropertyid(String propertyid) {
        this.propertyid = propertyid;
    }

    /**
     * 
     * @return
     *     The floorno
     */
    @JsonProperty("floorno")
    public String getFloorno() {
        return floorno;
    }

    /**
     * 
     * @param floorno
     *     The floorno
     */
    @JsonProperty("floorno")
    public void setFloorno(String floorno) {
        this.floorno = floorno;
    }

    /**
     * 
     * @return
     *     The unitno
     */
    @JsonProperty("unitno")
    public String getUnitno() {
        return unitno;
    }

    /**
     * 
     * @param unitno
     *     The unitno
     */
    @JsonProperty("unitno")
    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    /**
     * 
     * @return
     *     The occupied
     */
    @JsonProperty("occupied")
    public String getOccupied() {
        return occupied;
    }

    /**
     * 
     * @param occupied
     *     The occupied
     */
    @JsonProperty("occupied")
    public void setOccupied(String occupied) {
        this.occupied = occupied;
    }

    /**
     * 
     * @return
     *     The occupiedspace
     */
    @JsonProperty("occupiedspace")
    public Occupiedspace getOccupiedspace() {
        return occupiedspace;
    }

    /**
     * 
     * @param occupiedspace
     *     The occupiedspace
     */
    @JsonProperty("occupiedspace")
    public void setOccupiedspace(Occupiedspace occupiedspace) {
        this.occupiedspace = occupiedspace;
    }

    /**
     * 
     * @return
     *     The availablespace
     */
    @JsonProperty("availablespace")
    public Availablespace getAvailablespace() {
        return availablespace;
    }

    /**
     * 
     * @param availablespace
     *     The availablespace
     */
    @JsonProperty("availablespace")
    public void setAvailablespace(Availablespace availablespace) {
        this.availablespace = availablespace;
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
