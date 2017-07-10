package com.mahindra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linmo on 2017/7/10.
 */
@RestController("/")

public class ProductController {
    @Autowired
    @RequestMapping("/")
    String home(){
        return  "Hello Enough";
    }

}
