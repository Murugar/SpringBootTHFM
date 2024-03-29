package com.iqmsoft.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		return "index";
	}
	
	
	@RequestMapping("/thymeleaf")
	public String thymeleaf(Map<String, Object> model) {
		return "thymeleaf";
	}

	@ResponseBody
	@RequestMapping("/ajaxJson")
	public List<String> ajaxJson() {
		List<String> jsons = new ArrayList<>();
		jsons.add("Test1");
		jsons.add("Test2");
		jsons.add("Test3");
		return jsons;
}
}
