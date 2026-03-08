package com.capg.springboot;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CapgController {
//	@Autowired
	CapgTopicsService topicsService;
	@RequestMapping("login.spring")
	public String loginValid() {
		return  "Welcome to Spring boot application 4";
	}
	@RequestMapping("/myController")
	public String display() {
		return  "myController";
	}
	@RequestMapping("/capgtopics")
	public List<CapgTopics> getAllTopics(){
		return topicsService.getAllMYTopics();
	}
	@RequestMapping(method=RequestMethod.POST,value="/capgtopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicsService.addTopics(topic);
	}
}
