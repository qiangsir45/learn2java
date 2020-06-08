package com.how2java.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Before("com.how2java.test.Demo.demo1()")
    public void mybefore(){
        System.out.println("前置");
    }
    @After("com.how2java.test.Demo.demo1()")
    public void myafter(){
        System.out.println("后置");
    }
    @AfterReturning("com.how2java.test.Demo.demo1()")
    public void myaftering(){
        System.out.println("后置returning");
    }
}
