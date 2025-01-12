package com.in28minutes.learn_spring_aop.aopexample.business;

import com.in28minutes.learn_spring_aop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataservice1;

    public BusinessService1(DataService1 dataservice1){
        this.dataservice1 = dataservice1;
    }

    public int calculateMax() {
        int[] data = dataservice1.retrieveData();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //throw new RuntimeException("Something went wrong");

       return Arrays.stream(data).max().orElse(0);
    }
}
