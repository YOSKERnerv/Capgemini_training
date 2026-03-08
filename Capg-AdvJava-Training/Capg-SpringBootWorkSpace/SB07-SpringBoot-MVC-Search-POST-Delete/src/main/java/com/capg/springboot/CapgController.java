package com.capg.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgController {
	@Autowired

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
	@RequestMapping(value="/capgtopics/{id}")
	public CapgTopics getTopic(@PathVariable String id) {
		return topicsService.getTopics(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/capgtopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicsService.addTopics(topic);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics{id}")
	public void deleteTopic(@RequestBody CapgTopics topic,String id){
		topicsService.deleteTopic(id);
	}
}
