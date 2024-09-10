package com.study.ljit.poc_kafka_producer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/hello/{message}")
    public void sendMessage(
            @PathVariable String message
    ) {
        this.kafkaTemplate.send("topics.hello.request.topic", message);
    }

}
