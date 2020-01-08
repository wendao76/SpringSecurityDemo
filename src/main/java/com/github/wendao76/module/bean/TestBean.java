package com.github.wendao76.module.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class TestBean {
    private String attrA;

    private String attrB;

    public TestBean () {
        System.out.println("TestBean.construct");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("TestBean.initMethod");
    }
}
