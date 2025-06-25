package com.in28minute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration         // all the spring beans are defined and maganed here 
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "raghav";
    }
}
