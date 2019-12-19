package com.zking.eurekaconsumer01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumer01Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumer01Application.class, args);
	}

}
