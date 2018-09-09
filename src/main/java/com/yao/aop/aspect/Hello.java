package com.yao.aop.aspect;

/**
 * Creator: Yao
 * Date:    2018/9/7
 * For:
 * Other:
 */
public class Hello {

    public static void main(String[] args) {
        new Hello().say();
    }

    public void say() {
        System.out.println("Hello");
    }
}
