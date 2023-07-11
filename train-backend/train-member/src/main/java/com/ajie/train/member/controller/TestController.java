package com.ajie.train.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ajie
 * @date 2023/7/10
 * @description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello() {
        System.out.println(" hello !");
        return "hello";
    }

}
