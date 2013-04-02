package com.javapassion.examples;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main implements ApplicationContextAware {
    
    private ApplicationContext ctx;
    
    // A bean which implements ApplicationContextAware interface and is
    // deployed into the context will be called back on creation of the
    // bean, using the interface's setApplicationContext() method, and
    // provided with a reference to the context, which may be stored
    // for later interaction with the context.
    public void setApplicationContext(ApplicationContext applicationContext)
                throws BeansException {
        ctx = applicationContext;
    }
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "aware.xml");
        
        // ContextAwareDemo bean implements ApplicationContextAware interface
        Main demo = (Main) ctx.getBean("contextAware");
        demo.displayAppContext();
    }
    
    public void displayAppContext() {
        System.out.println("Displaying ApplicationContext object...\n");
        System.out.println(ctx);
    }
}