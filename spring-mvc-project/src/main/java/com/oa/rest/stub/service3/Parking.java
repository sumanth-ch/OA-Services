
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
    "noofcars",
    "nooftwowheelers"
})
public class Parking {

    @JsonProperty("noofcars")
    private String noofcars;
    @JsonProperty("nooftwowheelers")
    private String nooftwowheelers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The nooftwowheelers
     */
    @JsonProperty("nooftwowheelers")
    public String getNooftwowheelers() {
        return nooftwowheelers;
    }

    /**
     * 
     * @param nooftwowheelers
     *     The nooftwowheelers
     */
    @JsonProperty("nooftwowheelers")
    public void setNooftwowheelers(String nooftwowheelers) {
        this.nooftwowheelers = nooftwowheelers;
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
