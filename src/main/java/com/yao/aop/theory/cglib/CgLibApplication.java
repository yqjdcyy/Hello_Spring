package com.yao.aop.theory.cglib;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public class CgLibApplication {

    public static void main(String[] args) {

        Human human = new Human();
        Human proxy = CglibFactory.getInstance(new CglibProxy());

        human.walk();
        System.out.println();
        proxy.walk();
    }
}
