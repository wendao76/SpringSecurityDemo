package com.github.wendao76.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试控制器
 * @author wendao76
 */
@RestController
@RequestMapping
public class IndexController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }
}
