
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
    "totleaseablearea",
    "builtuparea",
    "floorplatesize",
    "efficiency",
    "totalunits",
    "commonarea",
    "floortoceilinght",
    "powerbackup",
    "AC",
    "carparkingratio",
    "nooflifts",
    "capacityoflift",
    "bldgmgrname"
})
public class Buidlinginfo {

    @JsonProperty("totleaseablearea")
    private String totleaseablearea;
    @JsonProperty("builtuparea")
    private String builtuparea;
    @JsonProperty("floorplatesize")
    private String floorplatesize;
    @JsonProperty("efficiency")
    private String efficiency;
    @JsonProperty("totalunits")
    private String totalunits;
    @JsonProperty("commonarea")
    private String commonarea;
    @JsonProperty("floortoceilinght")
    private String floortoceilinght;
    @JsonProperty("powerbackup")
    private String powerbackup;
    @JsonProperty("AC")
    private String AC;
    @JsonProperty("carparkingratio")
    private String carparkingratio;
    @JsonProperty("nooflifts")
    private String nooflifts;
    @JsonProperty("capacityoflift")
    private String capacityoflift;
    @JsonProperty("bldgmgrname")
    private String bldgmgrname;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The totleaseablearea
     */
    @JsonProperty("totleaseablearea")
    public String getTotleaseablearea() {
        return totleaseablearea;
    }

    /**
     * 
     * @param totleaseablearea
     *     The totleaseablearea
     */
    @JsonProperty("totleaseablearea")
    public void setTotleaseablearea(String totleaseablearea) {
        this.totleaseablearea = totleaseablearea;
    }

    /**
     * 
     * @return
     *     The builtuparea
     */
    @JsonProperty("builtuparea")
    public String getBuiltuparea() {
        return builtuparea;
    }

    /**
     * 
     * @param builtuparea
     *     The builtuparea
     */
    @JsonProperty("builtuparea")
    public void setBuiltuparea(String builtuparea) {
        this.builtuparea = builtuparea;
    }

    /**
     * 
     * @return
     *     The floorplatesize
     */
    @JsonProperty("floorplatesize")
    public String getFloorplatesize() {
        return floorplatesize;
    }

    /**
     * 
     * @param floorplatesize
     *     The floorplatesize
     */
    @JsonProperty("floorplatesize")
    public void setFloorplatesize(String floorplatesize) {
        this.floorplatesize = floorplatesize;
    }

    /**
     * 
     * @return
     *     The efficiency
     */
    @JsonProperty("efficiency")
    public String getEfficiency() {
        return efficiency;
    }

    /**
     * 
     * @param efficiency
     *     The efficiency
     */
    @JsonProperty("efficiency")
    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    /**
     * 
     * @return
     *     The totalunits
     */
    @JsonProperty("totalunits")
    public String getTotalunits() {
        return totalunits;
    }

    /**
     * 
     * @param totalunits
     *     The totalunits
     */
    @JsonProperty("totalunits")
    public void setTotalunits(String totalunits) {
        this.totalunits = totalunits;
    }

    /**
     * 
     * @return
     *     The commonarea
     */
    @JsonProperty("commonarea")
    public String getCommonarea() {
        return commonarea;
    }

    /**
     * 
     * @param commonarea
     *     The commonarea
     */
    @JsonProperty("commonarea")
    public void setCommonarea(String commonarea) {
        this.commonarea = commonarea;
    }

    /**
     * 
     * @return
     *     The floortoceilinght
     */
    @JsonProperty("floortoceilinght")
    public String getFloortoceilinght() {
        return floortoceilinght;
    }

    /**
     * 
     * @param floortoceilinght
     *     The floortoceilinght
     */
    @JsonProperty("floortoceilinght")
    public void setFloortoceilinght(String floortoceilinght) {
        this.floortoceilinght = floortoceilinght;
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
     *     The AC
     */
    @JsonProperty("AC")
    public String getAC() {
        return AC;
    }

    /**
     * 
     * @param AC
     *     The AC
     */
    @JsonProperty("AC")
    public void setAC(String AC) {
        this.AC = AC;
    }

    /**
     * 
     * @return
     *     The carparkingratio
     */
    @JsonProperty("carparkingratio")
    public String getCarparkingratio() {
        return carparkingratio;
    }

    /**
     * 
     * @param carparkingratio
     *     The carparkingratio
     */
    @JsonProperty("carparkingratio")
    public void setCarparkingratio(String carparkingratio) {
        this.carparkingratio = carparkingratio;
    }

    /**
     * 
     * @return
     *     The nooflifts
     */
    @JsonProperty("nooflifts")
    public String getNooflifts() {
        return nooflifts;
    }

    /**
     * 
     * @param nooflifts
     *     The nooflifts
     */
    @JsonProperty("nooflifts")
    public void setNooflifts(String nooflifts) {
        this.nooflifts = nooflifts;
    }

    /**
     * 
     * @return
     *     The capacityoflift
     */
    @JsonProperty("capacityoflift")
    public String getCapacityoflift() {
        return capacityoflift;
    }

    /**
     * 
     * @param capacityoflift
     *     The capacityoflift
     */
    @JsonProperty("capacityoflift")
    public void setCapacityoflift(String capacityoflift) {
        this.capacityoflift = capacityoflift;
    }

    /**
     * 
     * @return
     *     The bldgmgrname
     */
    @JsonProperty("bldgmgrname")
    public String getBldgmgrname() {
        return bldgmgrname;
    }

    /**
     * 
     * @param bldgmgrname
     *     The bldgmgrname
     */
    @JsonProperty("bldgmgrname")
    public void setBldgmgrname(String bldgmgrname) {
        this.bldgmgrname = bldgmgrname;
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
