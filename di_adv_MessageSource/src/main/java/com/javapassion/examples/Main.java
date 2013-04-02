package com.javapassion.examples;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "./appcontext/messageSource.xml");
        
        Locale english = Locale.ENGLISH;
        Locale czech = new Locale("cs", "CZ");
        
        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, czech));
        
        System.out.println(ctx.getMessage("nameMsg", new Object[] { "Rob",
        "Harrop" }, english));
    }
}