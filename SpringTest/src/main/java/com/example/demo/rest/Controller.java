package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringTest
 * @description:
 * @author: dongfeng.guo
 * @create: 2022-06-23 15:39
 */
@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWord(){
        return "你好";
    }
}
