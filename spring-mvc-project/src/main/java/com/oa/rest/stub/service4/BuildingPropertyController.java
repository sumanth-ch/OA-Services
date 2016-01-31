package com.oa.rest.stub.service4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/buildingpropertyinfo")
@EnableWebMvc
public class BuildingPropertyController {
	
	@RequestMapping(value = "/updatebuildingproperty", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody BuildingProperty updateBuildingProperty(@RequestBody BuildingProperty buildingProperty) {
		BuildingProperty buildingLevelInfo = new BuildingProperty();
		buildingLevelInfo.setPropertyid("12345");
		return buildingLevelInfo;
	}

}
