package com.in28minute.learningspringframework.examples.g1;


import java.util.Arrays;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

// @Component
@Named       // Alternative of  @Component , Annotation in jakarta     
class BusinessService{
    DataService dataService;

    // @Autowired
    @Inject                // Alternative of @Autowired , Annotation in jakarta
    public void setDataService(DataService dataService) {
        System.out.println("setter injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

@Component
class DataService{

}

@Configuration      
@ComponentScan     
public class CdiCongextLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (CdiCongextLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
        
    }
}
