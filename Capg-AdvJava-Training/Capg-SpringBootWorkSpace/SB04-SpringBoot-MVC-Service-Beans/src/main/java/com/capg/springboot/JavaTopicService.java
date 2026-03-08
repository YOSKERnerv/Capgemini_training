package com.capg.springboot;
import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class JavaTopicService {
	
	public List topics=Arrays.asList(new JavaTopics("SpringBoot","SpringMVC","Spring"),new JavaTopics("JPA","Hibernate","JDBC"),new JavaTopics("ReactJS","JavaScript","UI"));
	public List<JavaTopics> getAllMYTopics(){
		return topics;
	}
}
