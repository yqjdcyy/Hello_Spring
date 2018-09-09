package com.yao.aop.spring.jdk;

import com.yao.aop.spring.advice.Timer;
import com.yao.aop.spring.common.Person;
import org.springframework.stereotype.Component;

/**
 * Creator: Yao
 * Date:    2018/9/7
 * For:
 * Other:
 */
@Component
public class Chinese implements Person {

    @Timer
    @Override
    public String say(String name) {

        name = "中国人讲：" + name;
        System.out.println(name);
        return name;
    }

    public void eat(String food) {
        System.out.println("我正在吃" + food);
    }
}
