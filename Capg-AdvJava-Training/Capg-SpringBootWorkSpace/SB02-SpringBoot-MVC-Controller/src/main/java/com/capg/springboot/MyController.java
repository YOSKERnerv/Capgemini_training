package com.capg.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("login.spring")
	public String loginValid() {
		return "Welcome to SpringBoot Apllication";
	}
	@RequestMapping("yosker.spring")
	public String yoskerValid(){
		return "Welcome to SpringBooot Application Helllo Yosker";
	}
}
