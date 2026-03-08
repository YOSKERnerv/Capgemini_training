package com.capg.springboot;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {

    private List<CapgTopics> myTopics = new ArrayList<>(Arrays.asList(
        new CapgTopics("SpringBoot","SpringMVC","Spring"),
        new CapgTopics("JPA","Hibernate","JDBC"),
        new CapgTopics("ReactJS","JavaScript","UI")
    ));

    public List<CapgTopics> getAllMYTopics() {
        return myTopics;
    }

    public void addTopics(CapgTopics topic) {
        myTopics.add(topic);
    }

    public CapgTopics getTopics(String id) {
        return myTopics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void deleteTopic(String id) {
        myTopics.removeIf(t -> t.getId().equals(id));
    }
}