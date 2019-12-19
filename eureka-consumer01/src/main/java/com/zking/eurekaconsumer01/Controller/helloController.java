package com.zking.eurekaconsumer01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class helloController {
@Autowired
    private RestTemplate restTemplate;
    @RequestMapping("hello")
    public   String hello(){
        String url="http://localhost:7201/hello";
        String message = restTemplate.getForObject(url, String.class);
        return message;
    }
}
