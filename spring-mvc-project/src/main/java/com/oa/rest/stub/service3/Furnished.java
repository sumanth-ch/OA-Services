
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
    "isfurnished",
    "workstations",
    "conferencehalls",
    "cabins",
    "acs"
})
public class Furnished {

    @JsonProperty("isfurnished")
    private String isfurnished;
    @JsonProperty("workstations")
    private String workstations;
    @JsonProperty("conferencehalls")
    private String conferencehalls;
    @JsonProperty("cabins")
    private String cabins;
    @JsonProperty("acs")
    private String acs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The isfurnished
     */
    @JsonProperty("isfurnished")
    public String getIsfurnished() {
        return isfurnished;
    }

    /**
     * 
     * @param isfurnished
     *     The isfurnished
     */
    @JsonProperty("isfurnished")
    public void setIsfurnished(String isfurnished) {
        this.isfurnished = isfurnished;
    }

    /**
     * 
     * @return
     *     The workstations
     */
    @JsonProperty("workstations")
    public String getWorkstations() {
        return workstations;
    }

    /**
     * 
     * @param workstations
     *     The workstations
     */
    @JsonProperty("workstations")
    public void setWorkstations(String workstations) {
        this.workstations = workstations;
    }

    /**
     * 
     * @return
     *     The conferencehalls
     */
    @JsonProperty("conferencehalls")
    public String getConferencehalls() {
        return conferencehalls;
    }

    /**
     * 
     * @param conferencehalls
     *     The conferencehalls
     */
    @JsonProperty("conferencehalls")
    public void setConferencehalls(String conferencehalls) {
        this.conferencehalls = conferencehalls;
    }

    /**
     * 
     * @return
     *     The cabins
     */
    @JsonProperty("cabins")
    public String getCabins() {
        return cabins;
    }

    /**
     * 
     * @param cabins
     *     The cabins
     */
    @JsonProperty("cabins")
    public void setCabins(String cabins) {
        this.cabins = cabins;
    }

    /**
     * 
     * @return
     *     The acs
     */
    @JsonProperty("acs")
    public String getAcs() {
        return acs;
    }

    /**
     * 
     * @param acs
     *     The acs
     */
    @JsonProperty("acs")
    public void setAcs(String acs) {
        this.acs = acs;
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
