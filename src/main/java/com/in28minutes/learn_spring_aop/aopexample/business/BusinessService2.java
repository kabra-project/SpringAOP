package com.in28minutes.learn_spring_aop.aopexample.business;

import com.in28minutes.learn_spring_aop.aopexample.data.Dataservice2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {

    private Dataservice2 dataservice2;

    public BusinessService2(Dataservice2 dataservice2){
        this.dataservice2 = dataservice2;
    }

    public int calculateMin() {
        int[] data = dataservice2.retrieveData();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //throw new RuntimeException("Something went wrong");

       return Arrays.stream(data).min().orElse(0);
    }
}
