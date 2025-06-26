package com.in28minute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record class(data carried final classes) 
// auto generate constructor/ hashcode()/ tostring metod/and getter methods
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
    @Bean(name = "address2")         // can have custom name for the Bean
    public Address address(){        //method name is still the same
        return new Address("avas vikas", "chandausi");
    }
    @Bean(name= "address3")         
    public Address address3(){
        return new Address("los angleis", "America");
    }
}
