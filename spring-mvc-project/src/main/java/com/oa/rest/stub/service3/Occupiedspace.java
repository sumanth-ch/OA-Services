
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
    "occupantsname",
    "areaoccupied",
    "commercialvariant",
    "dateofoccupancy",
    "leaseexpirydate",
    "rentpersqft",
    "contactmgr",
    "phoneno",
    "emailid",
    "ownerdetails",
    "commercialsegment",
    "address",
    "netvalue",
    "maintenance",
    "othercharges",
    "leaseperiod",
    "lockingperiod",
    "securitydeposit",
    "escalation",
    "rentfreeperiod",
    "servicetax",
    "propertytax",
    "stampduty",
    "parkingcharges",
    "notes"
})
public class Occupiedspace {

    @JsonProperty("occupantsname")
    private String occupantsname;
    @JsonProperty("areaoccupied")
    private String areaoccupied;
    @JsonProperty("commercialvariant")
    private String commercialvariant;
    @JsonProperty("dateofoccupancy")
    private String dateofoccupancy;
    @JsonProperty("leaseexpirydate")
    private String leaseexpirydate;
    @JsonProperty("rentpersqft")
    private String rentpersqft;
    @JsonProperty("contactmgr")
    private String contactmgr;
    @JsonProperty("phoneno")
    private String phoneno;
    @JsonProperty("emailid")
    private String emailid;
    @JsonProperty("ownerdetails")
    private Ownerdetails ownerdetails;
    @JsonProperty("commercialsegment")
    private Commercialsegment commercialsegment;
    @JsonProperty("address")
    private String address;
    @JsonProperty("netvalue")
    private String netvalue;
    @JsonProperty("maintenance")
    private String maintenance;
    @JsonProperty("othercharges")
    private String othercharges;
    @JsonProperty("leaseperiod")
    private String leaseperiod;
    @JsonProperty("lockingperiod")
    private String lockingperiod;
    @JsonProperty("securitydeposit")
    private String securitydeposit;
    @JsonProperty("escalation")
    private String escalation;
    @JsonProperty("rentfreeperiod")
    private String rentfreeperiod;
    @JsonProperty("servicetax")
    private String servicetax;
    @JsonProperty("propertytax")
    private String propertytax;
    @JsonProperty("stampduty")
    private String stampduty;
    @JsonProperty("parkingcharges")
    private String parkingcharges;
    @JsonProperty("notes")
    private String notes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The occupantsname
     */
    @JsonProperty("occupantsname")
    public String getOccupantsname() {
        return occupantsname;
    }

    /**
     * 
     * @param occupantsname
     *     The occupantsname
     */
    @JsonProperty("occupantsname")
    public void setOccupantsname(String occupantsname) {
        this.occupantsname = occupantsname;
    }

    /**
     * 
     * @return
     *     The areaoccupied
     */
    @JsonProperty("areaoccupied")
    public String getAreaoccupied() {
        return areaoccupied;
    }

    /**
     * 
     * @param areaoccupied
     *     The areaoccupied
     */
    @JsonProperty("areaoccupied")
    public void setAreaoccupied(String areaoccupied) {
        this.areaoccupied = areaoccupied;
    }

    /**
     * 
     * @return
     *     The commercialvariant
     */
    @JsonProperty("commercialvariant")
    public String getCommercialvariant() {
        return commercialvariant;
    }

    /**
     * 
     * @param commercialvariant
     *     The commercialvariant
     */
    @JsonProperty("commercialvariant")
    public void setCommercialvariant(String commercialvariant) {
        this.commercialvariant = commercialvariant;
    }

    /**
     * 
     * @return
     *     The dateofoccupancy
     */
    @JsonProperty("dateofoccupancy")
    public String getDateofoccupancy() {
        return dateofoccupancy;
    }

    /**
     * 
     * @param dateofoccupancy
     *     The dateofoccupancy
     */
    @JsonProperty("dateofoccupancy")
    public void setDateofoccupancy(String dateofoccupancy) {
        this.dateofoccupancy = dateofoccupancy;
    }

    /**
     * 
     * @return
     *     The leaseexpirydate
     */
    @JsonProperty("leaseexpirydate")
    public String getLeaseexpirydate() {
        return leaseexpirydate;
    }

    /**
     * 
     * @param leaseexpirydate
     *     The leaseexpirydate
     */
    @JsonProperty("leaseexpirydate")
    public void setLeaseexpirydate(String leaseexpirydate) {
        this.leaseexpirydate = leaseexpirydate;
    }

    /**
     * 
     * @return
     *     The rentpersqft
     */
    @JsonProperty("rentpersqft")
    public String getRentpersqft() {
        return rentpersqft;
    }

    /**
     * 
     * @param rentpersqft
     *     The rentpersqft
     */
    @JsonProperty("rentpersqft")
    public void setRentpersqft(String rentpersqft) {
        this.rentpersqft = rentpersqft;
    }

    /**
     * 
     * @return
     *     The contactmgr
     */
    @JsonProperty("contactmgr")
    public String getContactmgr() {
        return contactmgr;
    }

    /**
     * 
     * @param contactmgr
     *     The contactmgr
     */
    @JsonProperty("contactmgr")
    public void setContactmgr(String contactmgr) {
        this.contactmgr = contactmgr;
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

    /**
     * 
     * @return
     *     The ownerdetails
     */
    @JsonProperty("ownerdetails")
    public Ownerdetails getOwnerdetails() {
        return ownerdetails;
    }

    /**
     * 
     * @param ownerdetails
     *     The ownerdetails
     */
    @JsonProperty("ownerdetails")
    public void setOwnerdetails(Ownerdetails ownerdetails) {
        this.ownerdetails = ownerdetails;
    }

    /**
     * 
     * @return
     *     The commercialsegment
     */
    @JsonProperty("commercialsegment")
    public Commercialsegment getCommercialsegment() {
        return commercialsegment;
    }

    /**
     * 
     * @param commercialsegment
     *     The commercialsegment
     */
    @JsonProperty("commercialsegment")
    public void setCommercialsegment(Commercialsegment commercialsegment) {
        this.commercialsegment = commercialsegment;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The netvalue
     */
    @JsonProperty("netvalue")
    public String getNetvalue() {
        return netvalue;
    }

    /**
     * 
     * @param netvalue
     *     The netvalue
     */
    @JsonProperty("netvalue")
    public void setNetvalue(String netvalue) {
        this.netvalue = netvalue;
    }

    /**
     * 
     * @return
     *     The maintenance
     */
    @JsonProperty("maintenance")
    public String getMaintenance() {
        return maintenance;
    }

    /**
     * 
     * @param maintenance
     *     The maintenance
     */
    @JsonProperty("maintenance")
    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    /**
     * 
     * @return
     *     The othercharges
     */
    @JsonProperty("othercharges")
    public String getOthercharges() {
        return othercharges;
    }

    /**
     * 
     * @param othercharges
     *     The othercharges
     */
    @JsonProperty("othercharges")
    public void setOthercharges(String othercharges) {
        this.othercharges = othercharges;
    }

    /**
     * 
     * @return
     *     The leaseperiod
     */
    @JsonProperty("leaseperiod")
    public String getLeaseperiod() {
        return leaseperiod;
    }

    /**
     * 
     * @param leaseperiod
     *     The leaseperiod
     */
    @JsonProperty("leaseperiod")
    public void setLeaseperiod(String leaseperiod) {
        this.leaseperiod = leaseperiod;
    }

    /**
     * 
     * @return
     *     The lockingperiod
     */
    @JsonProperty("lockingperiod")
    public String getLockingperiod() {
        return lockingperiod;
    }

    /**
     * 
     * @param lockingperiod
     *     The lockingperiod
     */
    @JsonProperty("lockingperiod")
    public void setLockingperiod(String lockingperiod) {
        this.lockingperiod = lockingperiod;
    }

    /**
     * 
     * @return
     *     The securitydeposit
     */
    @JsonProperty("securitydeposit")
    public String getSecuritydeposit() {
        return securitydeposit;
    }

    /**
     * 
     * @param securitydeposit
     *     The securitydeposit
     */
    @JsonProperty("securitydeposit")
    public void setSecuritydeposit(String securitydeposit) {
        this.securitydeposit = securitydeposit;
    }

    /**
     * 
     * @return
     *     The escalation
     */
    @JsonProperty("escalation")
    public String getEscalation() {
        return escalation;
    }

    /**
     * 
     * @param escalation
     *     The escalation
     */
    @JsonProperty("escalation")
    public void setEscalation(String escalation) {
        this.escalation = escalation;
    }

    /**
     * 
     * @return
     *     The rentfreeperiod
     */
    @JsonProperty("rentfreeperiod")
    public String getRentfreeperiod() {
        return rentfreeperiod;
    }

    /**
     * 
     * @param rentfreeperiod
     *     The rentfreeperiod
     */
    @JsonProperty("rentfreeperiod")
    public void setRentfreeperiod(String rentfreeperiod) {
        this.rentfreeperiod = rentfreeperiod;
    }

    /**
     * 
     * @return
     *     The servicetax
     */
    @JsonProperty("servicetax")
    public String getServicetax() {
        return servicetax;
    }

    /**
     * 
     * @param servicetax
     *     The servicetax
     */
    @JsonProperty("servicetax")
    public void setServicetax(String servicetax) {
        this.servicetax = servicetax;
    }

    /**
     * 
     * @return
     *     The propertytax
     */
    @JsonProperty("propertytax")
    public String getPropertytax() {
        return propertytax;
    }

    /**
     * 
     * @param propertytax
     *     The propertytax
     */
    @JsonProperty("propertytax")
    public void setPropertytax(String propertytax) {
        this.propertytax = propertytax;
    }

    /**
     * 
     * @return
     *     The stampduty
     */
    @JsonProperty("stampduty")
    public String getStampduty() {
        return stampduty;
    }

    /**
     * 
     * @param stampduty
     *     The stampduty
     */
    @JsonProperty("stampduty")
    public void setStampduty(String stampduty) {
        this.stampduty = stampduty;
    }

    /**
     * 
     * @return
     *     The parkingcharges
     */
    @JsonProperty("parkingcharges")
    public String getParkingcharges() {
        return parkingcharges;
    }

    /**
     * 
     * @param parkingcharges
     *     The parkingcharges
     */
    @JsonProperty("parkingcharges")
    public void setParkingcharges(String parkingcharges) {
        this.parkingcharges = parkingcharges;
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
