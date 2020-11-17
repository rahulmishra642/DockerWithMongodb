package com.rainyday.grocery.customer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

import com.mongodb.ConnectionString;

@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(new SimpleMongoClientDbFactory(new ConnectionString(this.uri)));
    }
}
