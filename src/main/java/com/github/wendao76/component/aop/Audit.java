package com.github.wendao76.component.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 测试切面（两个注解都要加才有效果）
 * @author wendao76
 */
@Aspect
@Component
public class Audit {
    @Pointcut("execution(* com.github.wendao76.controller.*.hello(..))")
    public void hello() {
    }

    @Before("hello()")
    public void beforeHello() {
        System.out.println("beforeHello");
    }
}
