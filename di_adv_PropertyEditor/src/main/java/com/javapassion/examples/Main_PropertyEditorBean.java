package com.javapassion.examples;

import java.io.File;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main_PropertyEditorBean {

    private Class cls;
    private File file;
    private URL url;
    private Locale locale;
    private Properties properties;
    private String[] strings;
    private byte[] bytes;
    
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
                "builtin.xml"));
        Main_PropertyEditorBean bean = (Main_PropertyEditorBean) factory
                .getBean("builtInSample");
    }

    public void setClass(Class cls) {
        System.out.println("Setting class: " + cls.getName());
        this.cls = cls;
    }

    public void setFile(File file) {
        System.out.println("Setting file: " + file.getName());
        this.file = file;
    }

    public void setLocale(Locale locale) {
        System.out.println("Setting locale: " + locale.getDisplayName());
        this.locale = locale;
    }

    public void setProperties(Properties properties) {
        System.out.println("Loaded " + properties.size() + " properties");
        this.properties = properties;
    }

    public void setStrings(String[] strings) {
        System.out.println("Loaded " + strings.length + " Strings");
        this.strings = strings;
    }

    public void setUrl(URL url) {
        System.out.println("Setting URL: " + url.toExternalForm());
        this.url = url;
    }

    public void setBytes(byte[] bytes) {
        System.out.println("Adding " + bytes.length + " bytes");
        this.bytes = bytes;
    }

}