package com.oa.rest.stub.service2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/buildinginfo")
@EnableWebMvc
public class BuildingInfoController {
	
	@RequestMapping(value = "/updatebuilding", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody BuildingLevelInfo updateBuildingInfo(@RequestBody BuildingLevelInfo buildingLevelInfo) {
		BuildingLevelInfo buildingInfo = new BuildingLevelInfo();
		buildingInfo.setPropertyid("12345");
		return buildingInfo;
	}

}
