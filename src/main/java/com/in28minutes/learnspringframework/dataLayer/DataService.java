package com.in28minutes.learnspringframework.dataLayer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public
class DataService{

    public List<Integer> retrieveData(){
        return Arrays.asList(12,56,32,11);
    }

}
