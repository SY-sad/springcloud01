package com.zking.eurekaconsumer02.controller;


import com.zking.eurekaconsumer02.server.BookFeign;
import com.zking.eurekaconsumer02.server.TestFeign;
import com.zking.eurekaprovider.model.Book;
import com.zking.eurekaprovider.util.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/book")
@Slf4j
@RestController
public class BookController {
@Autowired
    private BookFeign bookFeign;

@RequestMapping("/add")
public String add(String name,Float price,String remark){
log.info("消费者BookController.add");
log.info("name={},price={},remark={}",name,price,remark);
    String data=bookFeign.add(name,price,remark);
    return data;
}

}
