package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution (* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
    public void logMethodCallBevorExecution(JoinPoint joinPoint){

        logger.info("Before Aspect - {} is called with the following Arguments: {}", joinPoint, joinPoint.getArgs());

    }

    @After("execution (* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){

        logger.info("After Aspect - {} has been executed", joinPoint);

    }

    @AfterThrowing(pointcut = "execution (* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))",
                    throwing = "exception")
    public void logMethodCallAfterThrowing(JoinPoint joinPoint, Exception exception){

        logger.info("After Throwing Aspect - {} has thrown an exception", joinPoint, exception);

    }

    @AfterReturning(pointcut =  "execution (* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))", returning = "result value")
    public void logMethodCallAfterReturning(JoinPoint joinPoint, Object resultValue){

        logger.info("After Successful Excecution - {} has returned", joinPoint, resultValue);

    }
}
