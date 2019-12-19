package com.zking.eurekaconsumer01.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
    @Bean
//    @LoadBalanced    //Ribbon负载均衡(手动开启)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
