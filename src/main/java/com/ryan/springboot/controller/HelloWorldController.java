package com.ryan.springboot.controller;

import com.ryan.springboot.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Description:helloWorld
 *@Author:Ryan
 *@Date:2018/1/30  23:53
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "hello world";
    }
}
