package com.in28minute.learningspringframework.examples.c1;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retriveData(){
        return new int[] {1,2,3,4,5};
    }
}
