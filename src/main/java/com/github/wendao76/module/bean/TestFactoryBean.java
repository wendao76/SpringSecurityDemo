package com.github.wendao76.module.bean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<TestBean> {

    @Override
    public TestBean getObject() throws Exception {
        System.out.println("testBean.getObject");
        TestBean testBean = new TestBean();
        testBean.setAttrA("testAttrA");
        return testBean;
    }

    @Override
    public Class<?> getObjectType() {
//        System.out.println("TestFactoryBean.getObjectType");
        return TestBean.class;
    }

}
