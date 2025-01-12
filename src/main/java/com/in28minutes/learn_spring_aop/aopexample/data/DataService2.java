package com.in28minutes.learn_spring_aop.aopexample.data;

import com.in28minutes.learn_spring_aop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

    @TrackTime
    public int[] retrieveData(){

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       return new int[]{21,32,3,45};
    }
}
