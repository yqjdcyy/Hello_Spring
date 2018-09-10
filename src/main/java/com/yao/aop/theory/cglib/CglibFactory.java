package com.yao.aop.theory.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public class CglibFactory {

    public static Human getInstance(CglibProxy proxy) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Human.class);
        enhancer.setCallback(proxy);
        return (Human) enhancer.create();
    }
}
