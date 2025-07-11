package com.in28minute.learningspringframework.examples.h1;


import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// it shows how to use contextApplication work 
// with XML file before Spring Context .

// not in use now a days:
@Configuration      
@ComponentScan      
public class XmlConfigurationCongextLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new ClassPathXmlApplicationContext
                ("ContextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
        
    }
}
