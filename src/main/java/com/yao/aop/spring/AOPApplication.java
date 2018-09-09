package com.yao.aop.spring;

import com.yao.aop.spring.cglib.American;
import com.yao.aop.spring.common.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Creator: Yao
 * Date:    2018/9/7
 * For:
 * Other:
 */
@SpringBootApplication
@ComponentScan
@EnableAspectJAutoProxy
@RestController
public class AOPApplication {

    @Autowired
    private American american;
    @Autowired
    private Person chinese;

    @RequestMapping("/aop/spring/jdk")
    public void jdk() {
        chinese.say("Hi");
        System.out.println(chinese.getClass());
    }

    @RequestMapping("/aop/spring/cglib")
    public void cglib() {
        american.say("Hi");
        american.eat("potato");
        System.out.println(american.getClass());
    }

    public static void main(String[] args) {
        SpringApplication.run(AOPApplication.class, args);
    }
}
