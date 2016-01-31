
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
@JsonPropertyOrder({ "propertype", "propertysubtype", "buildingdetails", "locationdetails", "neighbourhood",
		"buildingfeatures" })
public class PropertyInfo {

	@JsonProperty("propertype")
	private String propertype;
	@JsonProperty("propertysubtype")
	private String propertysubtype;
	@JsonProperty("buildingdetails")
	private Buildingdetails buildingdetails;
	@JsonProperty("locationdetails")
	private Locationdetails locationdetails;
	@JsonProperty("neighbourhood")
	private Neighbourhood neighbourhood;
	@JsonProperty("buildingfeatures")
	private Buildingfeatures buildingfeatures;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The propertype
	 */
	@JsonProperty("propertype")
	public String getPropertype() {
		return propertype;
	}

	/**
	 * 
	 * @param propertype
	 *            The propertype
	 */
	@JsonProperty("propertype")
	public void setPropertype(String propertype) {
		this.propertype = propertype;
	}

	/**
	 * 
	 * @return The propertysubtype
	 */
	@JsonProperty("propertysubtype")
	public String getPropertysubtype() {
		return propertysubtype;
	}

	/**
	 * 
	 * @param propertysubtype
	 *            The propertysubtype
	 */
	@JsonProperty("propertysubtype")
	public void setPropertysubtype(String propertysubtype) {
		this.propertysubtype = propertysubtype;
	}

	/**
	 * 
	 * @return The buildingdetails
	 */
	@JsonProperty("buildingdetails")
	public Buildingdetails getBuildingdetails() {
		return buildingdetails;
	}

	/**
	 * 
	 * @param buildingdetails
	 *            The buildingdetails
	 */
	@JsonProperty("buildingdetails")
	public void setBuildingdetails(Buildingdetails buildingdetails) {
		this.buildingdetails = buildingdetails;
	}

	/**
	 * 
	 * @return The locationdetails
	 */
	@JsonProperty("locationdetails")
	public Locationdetails getLocationdetails() {
		return locationdetails;
	}

	/**
	 * 
	 * @param locationdetails
	 *            The locationdetails
	 */
	@JsonProperty("locationdetails")
	public void setLocationdetails(Locationdetails locationdetails) {
		this.locationdetails = locationdetails;
	}

	/**
	 * 
	 * @return The neighbourhood
	 */
	@JsonProperty("neighbourhood")
	public Neighbourhood getNeighbourhood() {
		return neighbourhood;
	}

	/**
	 * 
	 * @param neighbourhood
	 *            The neighbourhood
	 */
	@JsonProperty("neighbourhood")
	public void setNeighbourhood(Neighbourhood neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	/**
	 * 
	 * @return The buildingfeatures
	 */
	@JsonProperty("buildingfeatures")
	public Buildingfeatures getBuildingfeatures() {
		return buildingfeatures;
	}

	/**
	 * 
	 * @param buildingfeatures
	 *            The buildingfeatures
	 */
	@JsonProperty("buildingfeatures")
	public void setBuildingfeatures(Buildingfeatures buildingfeatures) {
		this.buildingfeatures = buildingfeatures;
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
