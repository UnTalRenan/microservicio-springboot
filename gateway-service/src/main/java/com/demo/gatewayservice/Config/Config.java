package com.demo.gatewayservice.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {


    @Bean
    @LoadBalanced
    public WebClient.Builder buil(){
        return WebClient.builder();
    }

}
