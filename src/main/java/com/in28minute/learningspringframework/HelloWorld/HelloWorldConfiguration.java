package com.in28minute.learningspringframework.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record class(data carried final classes) 
// auto genqerate constructor/ hashcode()/ tostring metod/and getter methods
record Person(String name , int age,Address address){};
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
        return new Person("Rishabh pathak", 23,new Address("asafpur", "badaun"));
    }
    // creating Bean using existing Beans --> two ways by method or by parameter
    // using method
    @Bean
    public Person person2MethodCall(){        
        return new Person(name(),age(),address());   // calling name, age address method
    }
    // using parameter
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3quilifer")  Address address){
        return new Person(name, age, address);
    }
    @Bean(name = "address2")         // can have custom name for the Bean
    @Primary
    public Address address(){        //method name is still the same
        return new Address("avas vikas", "chandausi");
    }
    @Bean(name= "address3") 
    @Qualifier("address3quilifer")        
    public Address address3(){
        return new Address("los Angeles", "America");
    }
}
