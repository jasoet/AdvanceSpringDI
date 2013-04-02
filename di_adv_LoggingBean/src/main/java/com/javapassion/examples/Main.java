package com.javapassion.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext(
        "logging.xml");
        
        LoggingBean bean = (LoggingBean)factory.getBean("loggingBean");
        bean.someOperation();
    }
}