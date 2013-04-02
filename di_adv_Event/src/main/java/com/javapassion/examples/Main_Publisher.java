package com.javapassion.examples;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Publisher implements ApplicationContextAware {
    
    private ApplicationContext ctx;
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "events.xml");
        
        Main_Publisher pub = (Main_Publisher) ctx.getBean("publisher");
        
        // Publish two events
        pub.publishViaApplicationContext("Hello World!");
        pub.publishViaApplicationContext("The quick brown fox jumped over the lazy dog");
    }
    
    public void setApplicationContext(ApplicationContext applicationContext)
    throws BeansException {
        this.ctx = applicationContext;
        
    }
    
    public void publishViaApplicationContext(String message) {
        ctx.publishEvent(new MessageEvent(this, message));
    }
}