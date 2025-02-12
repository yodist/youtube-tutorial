package com.example.kafka_spring_boot_2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(String message) throws InterruptedException {
        Thread.sleep(100);
        logger.info("kami menerima pesan berikut: {}", message);
    }

}
