package com.javapassion.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
                "logging.xml"));
        
        LoggingBean bean1 = (LoggingBean)factory.getBean("loggingBean");
        LoggingBean bean2 = (LoggingBean)factory.getBean("loggingBean");

        System.out.println("Identity Equal?: " + (bean1 == bean2));
        
        System.out.println("Address of bean1" + bean1);
        System.out.println("Address of bean2" + bean2);
    }
}