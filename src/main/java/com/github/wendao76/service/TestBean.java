package com.github.wendao76.service;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@Data
public class TestBean {
    private String attrA;

    private String attrB;
}
