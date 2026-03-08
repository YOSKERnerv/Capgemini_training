package com.capg.springboot;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicsController {
	@Autowired
	JavaTopicService topicsService;
	@RequestMapping("login.spring")
	public String loginValid() {
		return  "Welcome to Spring boot application 4";
	}
	@RequestMapping("/javatopics")
	public List getAllTopics(){
		return topicsService.getAllMYTopics();
	}
	
	
}
