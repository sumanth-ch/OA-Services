package com.test.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@Controller
@RequestMapping("/employee-module")
@EnableWebMvc
public class EmployeeController
{
    @Autowired
    EmployeeManager manager;
 
    @RequestMapping(value = "{name}", method = RequestMethod.GET,produces = "application/json")
    public @ResponseBody DashBoard getDashBoardDetails(@PathVariable String name)
    {
    	DashBoard dashboard = new DashBoard();
		
		UserProfile user = new UserProfile();
		user.setName("Sumanth");
		user.setStreetName("Madhapur");
		
		DashBoardSummary summary = new DashBoardSummary();
		summary.setAllProperties("20");
		summary.setExpiredPropeties("30");
		summary.setExpiringProperties("40");
		summary.setPendingProperties("50");
		
		dashboard.setUserDetails(user);
		dashboard.setPropertySummary(summary);
		dashboard.setValidUser(true);
		
		return dashboard;
    }
}