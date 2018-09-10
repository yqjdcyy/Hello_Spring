package com.yao.aop.theory.jdk;

import java.lang.reflect.Proxy;

/**
 * Creator: Yao
 * Date:    2018/9/10
 * For:
 * Other:
 */
public class JDKApplication {

    public static void main(String[] args) {

        Animal animal = new Person();
        Animal proxy = (Animal) Proxy.newProxyInstance(
                animal.getClass().getClassLoader(),
                animal.getClass().getInterfaces(),
                new AnimalInvocationHandler(animal));

        animal.walk();
        System.out.println();
        proxy.walk();
    }
}
