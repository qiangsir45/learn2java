package com.how2java.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component()
public class Demo {
    @Pointcut("execution(* com.how2java.test.Demo.demo1())")
    public void demo1(){
        System.out.println("demo1");
    }
}
