package com.zking.eurekaconsumer02.server.fallback;

import com.zking.eurekaconsumer02.server.hellofeign;
import org.springframework.stereotype.Component;

@Component
public class HelloFeifinFallback implements hellofeign {
    @Override
    public String hello() {
        return "系统忙，赶紧滚。。。";
    }
}
