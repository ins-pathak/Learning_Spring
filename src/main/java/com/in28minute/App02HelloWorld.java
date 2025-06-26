package com.in28minute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {
    public static void main(String[] args) {
    //1. launching spring context 
    var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    //2. configure the things that are managed by spring - @configuration 
    // create configuration class using - @configuration
    // create bean with @bean 

    // retriveing spring bean 
    System.out.println(context.getBean("name"));
    System.out.println(context.getBean("age"));
    System.out.println(context.getBean("person"));
    System.out.println(context.getBean("address2"));
    // also called with type of the Bean(class) 
    System.out.println(context.getBean(Address.class)); // alternative to call 
    
    context.close();
    }
}
