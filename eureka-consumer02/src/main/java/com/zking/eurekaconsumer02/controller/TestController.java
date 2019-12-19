package com.zking.eurekaconsumer02.controller;

import com.zking.eurekaconsumer02.server.TestFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private TestFeign testFeign;

    @RequestMapping("/test1/{name}")
    public String test1(@PathVariable("name") String name){
        log.info("消费者TestController.test1");
        log.info("name={}",name);

        String data= testFeign.test1(name);
        return  data;

    }

    @RequestMapping("/test2")
    public String test2(String name,Float price){
        log.info("消费者TestController.test2");
        log.info("TestController.test2,name={},price={}",name,price);

        String data=testFeign.test2(name,price);
        return data;
    }

}
