package com.devtool.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=70;
		int b=30;
		int c=80;
		
		return "Sum of a+b is " +(a+b+c);
	}
}
