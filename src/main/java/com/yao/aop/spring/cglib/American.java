package com.yao.aop.spring.cglib;

import com.yao.aop.spring.advice.Timer;
import org.springframework.stereotype.Component;

/**
 * Creator: Yao
 * Date:    2018/9/7
 * For:
 * Other:
 */
@Component
public class American {

    @Timer
    public String say(String name) {

        name = "American.say: " + name;
        System.out.println(name);
        throw new IllegalStateException("U Known");
    }

    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }
}
