package com.learn2java.test;

import com.learn2java.pojo.Airport;
import com.learn2java.pojo.People;
import com.learn2java.service.impl.AirportServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names = ac.getBeanDefinitionNames();
//        for (String string:names) {
//            System.out.println(string);
//        }
        AirportServiceImpl airportService = ac.getBean("airportService", AirportServiceImpl.class);
        List<Airport> show = airportService.show();
        System.out.println(show);
    }
}

