package com.coursera.integration.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coursera.integration.admin.model.LmsCourseraConfigModel;
import com.coursera.integration.admin.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String welcome(Model model) {
		List<LmsCourseraConfigModel> listOfClientConfig = adminService.getListOfClientConfig();
		model.addAttribute("listOfClientConfig", listOfClientConfig);
		return "homePage";
	}

}
