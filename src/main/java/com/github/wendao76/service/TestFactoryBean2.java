package com.github.wendao76.service;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TestFactoryBean2 implements FactoryBean<TestBean2>, Ordered {

    @Override
    public TestBean2 getObject() throws Exception {
        System.out.println("testBean2.getObject");
        TestBean2 testBean = new TestBean2();
        testBean.setAttrA("testAttrA");
        return testBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestBean2.class;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
