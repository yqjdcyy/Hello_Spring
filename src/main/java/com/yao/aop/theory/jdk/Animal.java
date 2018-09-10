package com.yao.aop.theory.jdk;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public interface Animal {
    default void walk() {
        System.out.println("Animal is walking");
    }
}
