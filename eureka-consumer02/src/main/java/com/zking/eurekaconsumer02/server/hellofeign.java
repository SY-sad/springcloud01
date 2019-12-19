package com.zking.eurekaconsumer02.server;

import com.zking.eurekaconsumer02.server.fallback.HelloFeifinFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-provider",fallback = HelloFeifinFallback.class)
public interface hellofeign {
    @RequestMapping("/hello")
String hello();

}
