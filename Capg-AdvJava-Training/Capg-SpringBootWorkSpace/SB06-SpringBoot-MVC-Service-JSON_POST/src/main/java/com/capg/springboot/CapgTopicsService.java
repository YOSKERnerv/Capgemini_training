package com.capg.springboot;

import java.util.Arrays;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CapgTopicsService {
	public List topics = Arrays.asList( new CapgTopics("SpringBoot","SpringMVC","Spring"),new CapgTopics("JPA","Hibernate","JDBC"),new CapgTopics("ReactJS","JavaScript","UI"));
	List<CapgTopics> myTopics = new ArrayList<CapgTopics>(topics);
	public List<CapgTopics> getAllMYTopics(){
		return myTopics;
	}
	public void addTopics(CapgTopics topic) {
		myTopics.add(topic);
	}
}
