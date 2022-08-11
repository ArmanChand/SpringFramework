package com.in28minutes.learnspringframework.businessLogic;

import com.in28minutes.learnspringframework.dataLayer.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public
class BusinessService{

    @Autowired
    private DataService dataService;
    public long calcuateSum(){
        List<Integer> data =dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }


}