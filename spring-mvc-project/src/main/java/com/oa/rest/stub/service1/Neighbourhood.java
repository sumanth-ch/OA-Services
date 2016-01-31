
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
    "malls",
    "schools",
    "residential",
    "hospitals",
    "itpark"
})
public class Neighbourhood {

    @JsonProperty("malls")
    private String malls;
    @JsonProperty("schools")
    private String schools;
    @JsonProperty("residential")
    private String residential;
    @JsonProperty("hospitals")
    private String hospitals;
    @JsonProperty("itpark")
    private String itpark;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The malls
     */
    @JsonProperty("malls")
    public String getMalls() {
        return malls;
    }

    /**
     * 
     * @param malls
     *     The malls
     */
    @JsonProperty("malls")
    public void setMalls(String malls) {
        this.malls = malls;
    }

    /**
     * 
     * @return
     *     The schools
     */
    @JsonProperty("schools")
    public String getSchools() {
        return schools;
    }

    /**
     * 
     * @param schools
     *     The schools
     */
    @JsonProperty("schools")
    public void setSchools(String schools) {
        this.schools = schools;
    }

    /**
     * 
     * @return
     *     The residential
     */
    @JsonProperty("residential")
    public String getResidential() {
        return residential;
    }

    /**
     * 
     * @param residential
     *     The residential
     */
    @JsonProperty("residential")
    public void setResidential(String residential) {
        this.residential = residential;
    }

    /**
     * 
     * @return
     *     The hospitals
     */
    @JsonProperty("hospitals")
    public String getHospitals() {
        return hospitals;
    }

    /**
     * 
     * @param hospitals
     *     The hospitals
     */
    @JsonProperty("hospitals")
    public void setHospitals(String hospitals) {
        this.hospitals = hospitals;
    }

    /**
     * 
     * @return
     *     The itpark
     */
    @JsonProperty("itpark")
    public String getItpark() {
        return itpark;
    }

    /**
     * 
     * @param itpark
     *     The itpark
     */
    @JsonProperty("itpark")
    public void setItpark(String itpark) {
        this.itpark = itpark;
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
