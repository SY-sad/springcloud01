package com.zking.eurekaconsumer02.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("eureka-provider")
public interface TestFeign {
    @RequestMapping("/test1/{name}")
String test1(@PathVariable("name") String name);

    @RequestMapping("/test2")
    String test2(@RequestParam("name") String name, @RequestParam("price") Float price);
}
