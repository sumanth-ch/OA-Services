
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
    "it",
    "pharma",
    "hardware",
    "agriculture",
    "manufacturing",
    "logistics",
    "laboratories",
    "automobiles",
    "others"
})
public class Commercialsegment {

    @JsonProperty("it")
    private String it;
    @JsonProperty("pharma")
    private String pharma;
    @JsonProperty("hardware")
    private String hardware;
    @JsonProperty("agriculture")
    private String agriculture;
    @JsonProperty("manufacturing")
    private String manufacturing;
    @JsonProperty("logistics")
    private String logistics;
    @JsonProperty("laboratories")
    private String laboratories;
    @JsonProperty("automobiles")
    private String automobiles;
    @JsonProperty("others")
    private String others;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The it
     */
    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    /**
     * 
     * @param it
     *     The it
     */
    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    /**
     * 
     * @return
     *     The pharma
     */
    @JsonProperty("pharma")
    public String getPharma() {
        return pharma;
    }

    /**
     * 
     * @param pharma
     *     The pharma
     */
    @JsonProperty("pharma")
    public void setPharma(String pharma) {
        this.pharma = pharma;
    }

    /**
     * 
     * @return
     *     The hardware
     */
    @JsonProperty("hardware")
    public String getHardware() {
        return hardware;
    }

    /**
     * 
     * @param hardware
     *     The hardware
     */
    @JsonProperty("hardware")
    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    /**
     * 
     * @return
     *     The agriculture
     */
    @JsonProperty("agriculture")
    public String getAgriculture() {
        return agriculture;
    }

    /**
     * 
     * @param agriculture
     *     The agriculture
     */
    @JsonProperty("agriculture")
    public void setAgriculture(String agriculture) {
        this.agriculture = agriculture;
    }

    /**
     * 
     * @return
     *     The manufacturing
     */
    @JsonProperty("manufacturing")
    public String getManufacturing() {
        return manufacturing;
    }

    /**
     * 
     * @param manufacturing
     *     The manufacturing
     */
    @JsonProperty("manufacturing")
    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    /**
     * 
     * @return
     *     The logistics
     */
    @JsonProperty("logistics")
    public String getLogistics() {
        return logistics;
    }

    /**
     * 
     * @param logistics
     *     The logistics
     */
    @JsonProperty("logistics")
    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    /**
     * 
     * @return
     *     The laboratories
     */
    @JsonProperty("laboratories")
    public String getLaboratories() {
        return laboratories;
    }

    /**
     * 
     * @param laboratories
     *     The laboratories
     */
    @JsonProperty("laboratories")
    public void setLaboratories(String laboratories) {
        this.laboratories = laboratories;
    }

    /**
     * 
     * @return
     *     The automobiles
     */
    @JsonProperty("automobiles")
    public String getAutomobiles() {
        return automobiles;
    }

    /**
     * 
     * @param automobiles
     *     The automobiles
     */
    @JsonProperty("automobiles")
    public void setAutomobiles(String automobiles) {
        this.automobiles = automobiles;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
