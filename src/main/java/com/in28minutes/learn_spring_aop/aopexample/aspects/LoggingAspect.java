package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution (* com.in28minutes.learn_spring_aop.aopexample.business.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint){

        logger.info("Before Aspect - {} is called with the following Arguments: {}", joinPoint, joinPoint.getArgs());

    }
}
