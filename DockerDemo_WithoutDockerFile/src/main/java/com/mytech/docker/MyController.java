package com.mytech.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	
	@ResponseBody
	@RequestMapping("/index")
	public String index() {		
		return "Hello Docker................!!!!";
	}
}
