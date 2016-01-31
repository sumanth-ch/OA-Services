
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
    "possessiondate",
    "powerandbackup",
    "notes"
})
public class Bldgmgrdetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("phoneno")
    private String phoneno;
    @JsonProperty("possessiondate")
    private String possessiondate;
    @JsonProperty("powerandbackup")
    private String powerandbackup;
    @JsonProperty("notes")
    private String notes;
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
     *     The possessiondate
     */
    @JsonProperty("possessiondate")
    public String getPossessiondate() {
        return possessiondate;
    }

    /**
     * 
     * @param possessiondate
     *     The possessiondate
     */
    @JsonProperty("possessiondate")
    public void setPossessiondate(String possessiondate) {
        this.possessiondate = possessiondate;
    }

    /**
     * 
     * @return
     *     The powerandbackup
     */
    @JsonProperty("powerandbackup")
    public String getPowerandbackup() {
        return powerandbackup;
    }

    /**
     * 
     * @param powerandbackup
     *     The powerandbackup
     */
    @JsonProperty("powerandbackup")
    public void setPowerandbackup(String powerandbackup) {
        this.powerandbackup = powerandbackup;
    }

    /**
     * 
     * @return
     *     The notes
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * 
     * @param notes
     *     The notes
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
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
