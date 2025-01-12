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

    @Before("CommonPointcutConfig.businessAndDataservicePackageConfig()")
    public void logMethodCallBevorExecution(JoinPoint joinPoint){

        logger.info("Before Aspect - {} is called with the following Arguments: {}", joinPoint, joinPoint.getArgs());

    }

    @After("CommonPointcutConfig.businessAndDataservicePackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){

        logger.info("After Aspect - {} has been executed", joinPoint);

    }

    @AfterThrowing(pointcut = "CommonPointcutConfig.businessAndDataservicePackageConfig()",
                    throwing = "exception")
    public void logMethodCallAfterThrowing(JoinPoint joinPoint, Exception exception){

        logger.info("After Throwing Aspect - {} has thrown an exception", joinPoint, exception);

    }

    @AfterReturning(pointcut =  "CommonPointcutConfig.businessAndDataservicePackageConfig()", returning = "result")
    public void logMethodCallAfterReturning(JoinPoint joinPoint, int result){

        logger.info("After Successful Excecution - {} has returned {}", joinPoint, result);

    }
}
