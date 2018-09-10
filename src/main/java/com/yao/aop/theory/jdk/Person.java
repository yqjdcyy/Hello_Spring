package com.yao.aop.theory.jdk;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public class Person implements Animal {
    @Override
    public void walk() {
        System.out.printf("Person is walking");
    }
}
