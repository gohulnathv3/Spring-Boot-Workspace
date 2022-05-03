package io.spring.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//it tells that it's a controller class
@RestController
public class TopicController{

//    it is used to declare dependencies
    @Autowired
    private TopicService topicService;

//    to get all topics
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

//    to get the unique resource
    @RequestMapping("/topics/{id}")
//    public Topic getTopic(String id){
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

//    to create new topics using post request
    @RequestMapping(method = RequestMethod.POST, value = "/topics")

//    request body is used to convert the json body and convert into the instances and add it in topics
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

//    to update topic
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

//    to delete topic
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
