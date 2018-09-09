package com.yao.aop.spring.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Creator: Yao
 * Date:    2018/9/7
 * For:
 * Other:
 */
@Aspect
@Component
public class Advice {

    @Pointcut("@annotation(com.yao.aop.spring.advice.Timer)")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("\tAdvice.before");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("\tAdvice.after");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint point) throws Throwable {

        long time = System.currentTimeMillis();
        point.proceed();
        time = System.currentTimeMillis() - time;

        System.out.printf("\t%s executed in %d ms\n", point.getSignature(), time);
    }

    @AfterReturning(pointcut = "pointcut()")
    public void afterReturning(JoinPoint point) {

        System.out.println("\tAdvice.afterReturning");
    }

    @AfterThrowing(pointcut = "pointcut()")
    public void afterThrowing(JoinPoint point) {

        System.out.println("\tAdvice.afterThrowing");
    }
}
