package com.github.wendao76.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TestBeanServiceFacotryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 根据类型拿到所有的 beanNames
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("testBeanService");
        System.out.println(beanDefinition);
        System.out.println("TestBeanServiceFacotryPostProcessor.postProcessBeanFactory");
    }
}
