
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
    "buildingname",
    "propertytype",
    "yoc",
    "category"
})
public class Buildingdetails {

    @JsonProperty("buildingname")
    private String buildingname;
    @JsonProperty("propertytype")
    private String propertytype;
    @JsonProperty("yoc")
    private String yoc;
    @JsonProperty("category")
    private String category;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The buildingname
     */
    @JsonProperty("buildingname")
    public String getBuildingname() {
        return buildingname;
    }

    /**
     * 
     * @param buildingname
     *     The buildingname
     */
    @JsonProperty("buildingname")
    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    /**
     * 
     * @return
     *     The propertytype
     */
    @JsonProperty("propertytype")
    public String getPropertytype() {
        return propertytype;
    }

    /**
     * 
     * @param propertytype
     *     The propertytype
     */
    @JsonProperty("propertytype")
    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    /**
     * 
     * @return
     *     The yoc
     */
    @JsonProperty("yoc")
    public String getYoc() {
        return yoc;
    }

    /**
     * 
     * @param yoc
     *     The yoc
     */
    @JsonProperty("yoc")
    public void setYoc(String yoc) {
        this.yoc = yoc;
    }

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
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
