
package com.oa.rest.stub.service4;

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
    "finalsubmit"
})
public class BuildingProperty {

    @JsonProperty("propertyid")
    private String propertyid;
    @JsonProperty("finalsubmit")
    private String finalsubmit;
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
     *     The finalsubmit
     */
    @JsonProperty("finalsubmit")
    public String getFinalsubmit() {
        return finalsubmit;
    }

    /**
     * 
     * @param finalsubmit
     *     The finalsubmit
     */
    @JsonProperty("finalsubmit")
    public void setFinalsubmit(String finalsubmit) {
        this.finalsubmit = finalsubmit;
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
