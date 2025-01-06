package com.in28minutes.learn_spring_aop.aopexample.business;

import com.in28minutes.learn_spring_aop.aopexample.data.Dataservice1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private Dataservice1 dataservice1;

    public BusinessService1(Dataservice1 dataservice1){
        this.dataservice1 = dataservice1;
    }

    public int calculateMax(){
        int[] data = dataservice1.retrieveData();
       return Arrays.stream(data).max().orElse(0);
    }
}
