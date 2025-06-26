package com.in28minute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record class(data carried final classes) 
// auto generate constructor/ hashcode()/ tostring metod/and getter methods
record Person(String name , int age){};
record Address(String firstline, String city){};
@Configuration         // all the spring beans are defined and maganed here 
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "raghav";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean
    public Person person(){
        return new Person("Rishabh pathak", 23);
    }
    @Bean
    public Address address(){
        return new Address("avas vikas", "chandausi");
    }
}
