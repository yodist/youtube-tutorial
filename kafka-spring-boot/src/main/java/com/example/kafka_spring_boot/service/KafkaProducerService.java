package com.example.kafka_spring_boot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private static final String MY_TOPIC = "my-topic";

    public void sendMessage(String message) {
        kafkaTemplate.send(MY_TOPIC, message);
        logger.info("We sent a message to {}", MY_TOPIC);
    }
}