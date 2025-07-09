package com.in28minute.learningspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;


@Component
public class BusinessCalculatorService {

        private DataService dataService;
        // No need to call @autowired bcz of constructer dependency injection .
        BusinessCalculatorService(DataService dataService){    
            super();
            this.dataService = dataService;
        }
        
        public int findMax(){
            return Arrays.stream(dataService.retriveData()).max().orElse(0);
    }
}
