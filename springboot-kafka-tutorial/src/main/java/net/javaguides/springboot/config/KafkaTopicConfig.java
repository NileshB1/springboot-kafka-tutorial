package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic nilxTopic() {
        return TopicBuilder.name("kafka2java").build();
    }

    @Bean
    public NewTopic nilxJsonTopic() {
        return TopicBuilder.name("kafka2java_json").build();
    }
}
