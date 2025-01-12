package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonPointcutConfig {

    @Pointcut("execution (* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
    public void businessAndDataservicePackageConfig(){}

    @Pointcut("execution (* com.in28minutes.learn_spring_aop.aopexample.data.*.*(..))")
    public void dataservicePackageConfig(){}

    @Pointcut("execution (* com.in28minutes.learn_spring_aop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean(){

    }
}
