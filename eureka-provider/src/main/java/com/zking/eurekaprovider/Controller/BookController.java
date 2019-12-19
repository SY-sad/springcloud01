package com.zking.eurekaprovider.Controller;


import com.zking.eurekaprovider.model.Book;
import com.zking.eurekaprovider.util.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/book")
@Slf4j
@RestController
public class BookController {

    @RequestMapping("/add")
    public JsonData add(Book book){
        log.info("BookController.add");
        log.info("book={}",book);

        System.out.println("bookService.add(...)");
        JsonData jsonData =new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("书本新增成功1");
        return jsonData;
    }
}
