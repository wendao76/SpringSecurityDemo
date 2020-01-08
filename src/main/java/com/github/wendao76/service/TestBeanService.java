package com.github.wendao76.service;

import org.springframework.stereotype.Service;

/**
 * 用户服务
 * @author wendao76
 */
@Service
public class TestBeanService {
    public TestBeanService() {
    }

    public int sayHello(String name) {
        System.out.println("sayHello");
        return 0;
    }
}
