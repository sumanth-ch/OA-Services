
package com.oa.rest.stub.service1;

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
    "parking",
    "firenoc",
    "escalators",
    "powerbackup",
    "occupcert",
    "vasstu",
    "others",
    "water",
    "facilitymanager",
    "featurevariants"
})
public class Buildingfeatures {

    @JsonProperty("parking")
    private String parking;
    @JsonProperty("firenoc")
    private String firenoc;
    @JsonProperty("escalators")
    private String escalators;
    @JsonProperty("powerbackup")
    private String powerbackup;
    @JsonProperty("occupcert")
    private String occupcert;
    @JsonProperty("vasstu")
    private String vasstu;
    @JsonProperty("others")
    private String others;
    @JsonProperty("water")
    private String water;
    @JsonProperty("facilitymanager")
    private String facilitymanager;
    @JsonProperty("featurevariants")
    private String featurevariants;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The parking
     */
    @JsonProperty("parking")
    public String getParking() {
        return parking;
    }

    /**
     * 
     * @param parking
     *     The parking
     */
    @JsonProperty("parking")
    public void setParking(String parking) {
        this.parking = parking;
    }

    /**
     * 
     * @return
     *     The firenoc
     */
    @JsonProperty("firenoc")
    public String getFirenoc() {
        return firenoc;
    }

    /**
     * 
     * @param firenoc
     *     The firenoc
     */
    @JsonProperty("firenoc")
    public void setFirenoc(String firenoc) {
        this.firenoc = firenoc;
    }

    /**
     * 
     * @return
     *     The escalators
     */
    @JsonProperty("escalators")
    public String getEscalators() {
        return escalators;
    }

    /**
     * 
     * @param escalators
     *     The escalators
     */
    @JsonProperty("escalators")
    public void setEscalators(String escalators) {
        this.escalators = escalators;
    }

    /**
     * 
     * @return
     *     The powerbackup
     */
    @JsonProperty("powerbackup")
    public String getPowerbackup() {
        return powerbackup;
    }

    /**
     * 
     * @param powerbackup
     *     The powerbackup
     */
    @JsonProperty("powerbackup")
    public void setPowerbackup(String powerbackup) {
        this.powerbackup = powerbackup;
    }

    /**
     * 
     * @return
     *     The occupcert
     */
    @JsonProperty("occupcert")
    public String getOccupcert() {
        return occupcert;
    }

    /**
     * 
     * @param occupcert
     *     The occupcert
     */
    @JsonProperty("occupcert")
    public void setOccupcert(String occupcert) {
        this.occupcert = occupcert;
    }

    /**
     * 
     * @return
     *     The vasstu
     */
    @JsonProperty("vasstu")
    public String getVasstu() {
        return vasstu;
    }

    /**
     * 
     * @param vasstu
     *     The vasstu
     */
    @JsonProperty("vasstu")
    public void setVasstu(String vasstu) {
        this.vasstu = vasstu;
    }

    /**
     * 
     * @return
     *     The others
     */
    @JsonProperty("others")
    public String getOthers() {
        return others;
    }

    /**
     * 
     * @param others
     *     The others
     */
    @JsonProperty("others")
    public void setOthers(String others) {
        this.others = others;
    }

    /**
     * 
     * @return
     *     The water
     */
    @JsonProperty("water")
    public String getWater() {
        return water;
    }

    /**
     * 
     * @param water
     *     The water
     */
    @JsonProperty("water")
    public void setWater(String water) {
        this.water = water;
    }

    /**
     * 
     * @return
     *     The facilitymanager
     */
    @JsonProperty("facilitymanager")
    public String getFacilitymanager() {
        return facilitymanager;
    }

    /**
     * 
     * @param facilitymanager
     *     The facilitymanager
     */
    @JsonProperty("facilitymanager")
    public void setFacilitymanager(String facilitymanager) {
        this.facilitymanager = facilitymanager;
    }

    /**
     * 
     * @return
     *     The featurevariants
     */
    @JsonProperty("featurevariants")
    public String getFeaturevariants() {
        return featurevariants;
    }

    /**
     * 
     * @param featurevariants
     *     The featurevariants
     */
    @JsonProperty("featurevariants")
    public void setFeaturevariants(String featurevariants) {
        this.featurevariants = featurevariants;
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
