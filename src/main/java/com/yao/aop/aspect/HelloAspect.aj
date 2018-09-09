package com.yao.aop.aspect;

/**
 * Creator: Yao
 * Date:    2018/9/7
 * For:
 * Other:
 */
public aspect HelloAspect {

    void around():call(void Hello.say()){
        System.out.println("Hello.Aspect start");
        proceed();
        System.out.println("Hello.Aspect end");
    }
}