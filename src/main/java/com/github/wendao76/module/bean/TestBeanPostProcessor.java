package com.github.wendao76.module.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("testBean".equals(beanName)) {
            System.out.println("TestBeanPostProcessor.postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("testBean".equals(beanName)) {
            System.out.println("TestBeanPostProcessor.postProcessAfterInitialization");
        }
        return bean;
    }
}
