
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
    "name",
    "phoneno",
    "emailid"
})
public class Ownerdetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("phoneno")
    private String phoneno;
    @JsonProperty("emailid")
    private String emailid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The phoneno
     */
    @JsonProperty("phoneno")
    public String getPhoneno() {
        return phoneno;
    }

    /**
     * 
     * @param phoneno
     *     The phoneno
     */
    @JsonProperty("phoneno")
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    /**
     * 
     * @return
     *     The emailid
     */
    @JsonProperty("emailid")
    public String getEmailid() {
        return emailid;
    }

    /**
     * 
     * @param emailid
     *     The emailid
     */
    @JsonProperty("emailid")
    public void setEmailid(String emailid) {
        this.emailid = emailid;
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
