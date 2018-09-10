package com.yao.aop.theory.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public class AnimalInvocationHandler implements InvocationHandler {

    private Object target;

    public AnimalInvocationHandler() {
        super();
    }

    public AnimalInvocationHandler(Object target) {
        super();
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.printf("\n\tHandler.Before\n");
        Object result = method.invoke(target, args);
        System.out.printf("\n\tHandler.After\n");

        return result;
    }
}
