package com.in28minutes.learnspringframework.sampleEnterpriseFlow;


import com.in28minutes.learnspringframework.businessLogic.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calcuateSum();
    }

}


