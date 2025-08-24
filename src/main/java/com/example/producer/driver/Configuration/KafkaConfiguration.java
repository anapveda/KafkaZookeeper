package com.example.producer.driver.Configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
    public static final String CAB_LOCATION="cab_location";
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(CAB_LOCATION).build();
    }


}
