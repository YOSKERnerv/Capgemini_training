package com.capg.springboot;

import java.util.Arrays;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicController {
	@RequestMapping("login.spring")
	public String loginValis() {
		return "Welcome to SpringBoot Application";
	}
	@RequestMapping("/javatopics")
	public List getAllTopics() {
		return Arrays.asList(new JavaTopics("SpringBoot","SpringMVC","Spring"),new JavaTopics("JPA","HIbernate","JDBC"),new JavaTopics("ReactJS","UI","javaScript") );
	}
}
