package com.zking.eurekaconsumer02.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("eureka-provider")
public interface BookFeign {
    @RequestMapping("/book/add")
String add(@PathVariable("name") String name,@PathVariable("price") Float price,@PathVariable("remark") String remark);


}
