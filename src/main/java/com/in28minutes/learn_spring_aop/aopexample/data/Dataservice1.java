package com.in28minutes.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dataservice1 {

    public int[] retrieveData(){
       return new int[]{11,22,33,44};
    }
}
