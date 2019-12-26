package com.github.wendao76.controller;

import com.github.wendao76.service.TestBeanService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Autowired
    TestBeanService testService;

    @Value("${demo.app-name}")
    String appName;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

    @GetMapping("/" )
    public String index() {
        return appName;
    }

    @HystrixCommand(fallbackMethod = "fallbackTest")
    @GetMapping("/fallback")
    public String fallback() {
        throw new RuntimeException("发生错误了");
    }

    public String fallbackTest(Throwable th) {
        return "request failed:" + th.getMessage();
    }
}
