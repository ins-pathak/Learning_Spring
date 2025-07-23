package com.in28minute.learningspringframework.examples.d1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
@Lazy          // @lazy used so that ClassB is not initialized 
// with spring context || only initialized when in called .
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA){          // here is the dependency injection
        System.out.println("business logic of classB");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("class B doing something");
    }
}


@Configuration      
@ComponentScan
public class LasyAnnotationCongextLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (LasyAnnotationCongextLauncherApplication.class);){
            

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            
            context.getBean(ClassB.class).doSomething();
        }
        
        
    }
}
