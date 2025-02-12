package com.example.kafka_spring_boot.controller;

import com.example.kafka_spring_boot.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerController.class);

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessage(message);
        logger.info("sudah kirim message: {}", message);
        return String.format("Sukses mengirim pesan berikut: %s", message);
    }
}
