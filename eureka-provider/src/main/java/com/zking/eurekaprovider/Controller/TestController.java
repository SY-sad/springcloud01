package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.util.JsonData;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test1/{name}")
    public JsonData test1(@PathVariable String name){
        log.info("生产者TestController.test1");
        log.info("TestController.test1,name={}",name);

        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        jsonData.put("name",name);

        return jsonData;
    }

    @RequestMapping("/test2")
    public JsonData test2(String name,Float price){
        log.info("生产者TestController.test2");
        log.info("TestController.test2,name={},price={}",name,price);

        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        jsonData.put("name",name);
        jsonData.put("price",price);

        return jsonData;
    }
}
