package com.github.wendao76.module.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 根据类型拿到所有的 beanNames
        try{
            GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("testBean");
//            beanDefinition.setBeanClass(TestFactoryBean.class);
            System.out.println(beanDefinition);
        }catch (BeansException be) {
        }finally {
            System.out.println("TestBeanFactoryPostProcessor.postProcessBeanFactory");
        }

    }
}
