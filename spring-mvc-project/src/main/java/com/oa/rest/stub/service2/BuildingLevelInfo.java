
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
    "propertyid",
    "landarea",
    "totalfloors",
    "parking",
    "buidlinginfo"
})
public class BuildingLevelInfo {

    @JsonProperty("propertyid")
    private String propertyid;
    @JsonProperty("landarea")
    private String landarea;
    @JsonProperty("totalfloors")
    private String totalfloors;
    @JsonProperty("parking")
    private Parking parking;
    @JsonProperty("buidlinginfo")
    private Buidlinginfo buidlinginfo;
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
     *     The landarea
     */
    @JsonProperty("landarea")
    public String getLandarea() {
        return landarea;
    }

    /**
     * 
     * @param landarea
     *     The landarea
     */
    @JsonProperty("landarea")
    public void setLandarea(String landarea) {
        this.landarea = landarea;
    }

    /**
     * 
     * @return
     *     The totalfloors
     */
    @JsonProperty("totalfloors")
    public String getTotalfloors() {
        return totalfloors;
    }

    /**
     * 
     * @param totalfloors
     *     The totalfloors
     */
    @JsonProperty("totalfloors")
    public void setTotalfloors(String totalfloors) {
        this.totalfloors = totalfloors;
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
     *     The buidlinginfo
     */
    @JsonProperty("buidlinginfo")
    public Buidlinginfo getBuidlinginfo() {
        return buidlinginfo;
    }

    /**
     * 
     * @param buidlinginfo
     *     The buidlinginfo
     */
    @JsonProperty("buidlinginfo")
    public void setBuidlinginfo(Buidlinginfo buidlinginfo) {
        this.buidlinginfo = buidlinginfo;
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
