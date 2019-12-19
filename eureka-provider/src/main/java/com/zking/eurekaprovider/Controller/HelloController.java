package com.zking.eurekaprovider.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${hello}")
    private String hello;

    @Value("${username}")
    private String ds_username;

    @Value("${password}")
    private String ds_password;

    @Value("${spring.redis.password}")
    private String redis_password;

//    @Value("${hello.msg}")
//    private  String helloMsg;

@RequestMapping("hello")
public  String hello(){
    String msg="生产者["+ port +"]"+System.currentTimeMillis();
    msg +=", hello =" +hello;
    msg +=", ds_username =" +ds_username;
    msg +=", ds_password =" +ds_password;
    msg +=", redis_password =" +redis_password;
    return  msg;
}
}
