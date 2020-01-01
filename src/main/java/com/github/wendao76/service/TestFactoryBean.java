package com.github.wendao76.service;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class TestFactoryBean implements FactoryBean<TestBean>, Ordered {

    @Override
    public TestBean getObject() throws Exception {
        System.out.println("testBean.getObject");
        TestBean testBean = new TestBean();
        testBean.setAttrA("testAttrA");
        return testBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestBean.class;
    }

    @Override
    public int getOrder() {
        return 5;
    }
}
