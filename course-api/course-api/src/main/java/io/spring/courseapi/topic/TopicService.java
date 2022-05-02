package io.spring.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//make this class as service by using below annotation
@Service
//here we declare the business logic. so this is called business service class.
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring","Spring Framework", "Spring Framework Description"),
            new Topic("java","Java Framework", "Java Framework Description"),
            new Topic("JavaScript","JavaScript Framework", "JavaScript Framework Description"));

    public List<Topic> getAllTopics(){
        return topics;
    }

}
