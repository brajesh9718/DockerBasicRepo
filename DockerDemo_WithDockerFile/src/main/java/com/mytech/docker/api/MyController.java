package com.mytech.docker.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	
	@ResponseBody
	@RequestMapping("/dockerCall")
	public String index() {		
		return "Hello Docker................!!!!!";
	}
}
