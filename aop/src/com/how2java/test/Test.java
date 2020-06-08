package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.demo1();
//        demo.demo2();
//        demo.demo3();
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names = ac.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(names));
        Demo demo = ac.getBean("demo", Demo.class);
        try {
            demo.demo1();
        } catch (Exception e) {
        }
//        demo.demo2();
//        demo.demo3();
    }
}
