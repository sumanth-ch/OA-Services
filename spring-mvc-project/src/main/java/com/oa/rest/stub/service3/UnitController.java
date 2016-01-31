package com.oa.rest.stub.service3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/unitinfo")
@EnableWebMvc
public class UnitController {
	
	@RequestMapping(value = "/updateunit", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody UnitInfo updateUnitInfo(@RequestBody UnitInfo unitInfo) {
		UnitInfo unitLevelInfo = new UnitInfo();
		unitLevelInfo.setPropertyid("12345");
		return unitLevelInfo;
	}

}
