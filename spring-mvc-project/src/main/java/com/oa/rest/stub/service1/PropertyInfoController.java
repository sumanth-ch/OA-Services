package com.oa.rest.stub.service1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/propertyinfo")
@EnableWebMvc
public class PropertyInfoController {

	@RequestMapping(value = "/updateproperty", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody PropertyInfo updatePropertyInfo(@RequestBody PropertyInfo propertyInfo) {
		PropertyInfo propInfo = new PropertyInfo();
		propInfo.setPropertype("12345");
		return propInfo;
	}

}
