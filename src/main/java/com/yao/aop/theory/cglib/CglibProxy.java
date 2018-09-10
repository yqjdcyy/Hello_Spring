package com.yao.aop.theory.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("\tCGLIB.Before");
        methodProxy.invokeSuper(o, objects);
        System.out.println("\tCGLIB.After");

        return null;
    }
}
