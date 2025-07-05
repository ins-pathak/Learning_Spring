package com.in28minute.learningspringframework.HelloWorld;

import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {
    public static void main(String[] args) {
    //1. launching spring context 
    // try block to avoid resource leak (of context) context.close() autometically called
    try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
        //2. configure the things that are managed by spring - @configuration 
        // create configuration class using - @configuration
        // create bean with @bean 

        // retriveing spring bean 
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        
        System.out.println(context.getBean("person2MethodCall")); // Bean creation by existing method
        System.out.println(context.getBean("person3Parameters")); // Bean creation by existing parameters

        // also called with type of the Bean(class) 
        // give error if we have more than 1 bean of similar type bcz we are using type 

        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class)); // alternative to call 

        System.out.println(context.getBean("person5Qualifier"));

        // printing list of all beans with name
        Arrays.stream(context.getBeanDefinitionNames()) // bcz  .getBeanDefinitionName give String array
        .forEach(System.out::println);
       
        }
    }
}
