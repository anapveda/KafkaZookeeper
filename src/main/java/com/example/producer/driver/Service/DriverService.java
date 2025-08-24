package com.example.producer.driver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.example.producer.driver.Configuration.KafkaConfiguration.CAB_LOCATION;

@Service
public class DriverService {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void updateLocation(String s) {
kafkaTemplate.send(CAB_LOCATION,s);

    }
}
