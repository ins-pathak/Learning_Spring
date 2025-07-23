package com.in28minute.learningspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{
    @Override
    public int[] retriveData(){
        return new int[] {11,22,33,44,55};
    }
}
