package com.zking.eurekaconsumer02.controller;

import com.zking.eurekaconsumer02.server.hellofeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

@Autowired
    private hellofeign hellofeign;

@Value("${server.port}")
private String port;
    @RequestMapping("hello")
public   String  hello(){
    String hello ="消费者02["+port+"]"+hellofeign.hello();
    return  hello;
}

}
