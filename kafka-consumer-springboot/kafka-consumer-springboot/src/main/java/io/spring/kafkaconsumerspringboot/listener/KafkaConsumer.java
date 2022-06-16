package io.spring.kafkaconsumerspringboot.listener;

import io.spring.kafkaconsumerspringboot.model.User;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "topicOne", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed message: "+message);
    }
    @KafkaListener(topics = "TopicOneJson",groupId = "group_json", containerFactory = "userConcurrentKafkaListenerContainerFactory")
    public void consumeJSON(User user){
        System.out.println("Consumed JSON message: "+user);
    }
}