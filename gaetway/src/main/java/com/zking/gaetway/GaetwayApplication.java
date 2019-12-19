package com.zking.gaetway;

import com.zking.gaetway.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GaetwayApplication {

	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(GaetwayApplication.class, args);
	}

}
