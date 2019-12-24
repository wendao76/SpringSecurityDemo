package com.github.wendao76.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 用户服务
 * @author wendao76
 */
@Service
public class TestBeanService implements InitializingBean {
    public TestBeanService() {
        System.out.println("UserServiceImpl construct");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("initMethod");
    }
    public int sayHello(String name) {
        System.out.println("sayHello");
        return 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
