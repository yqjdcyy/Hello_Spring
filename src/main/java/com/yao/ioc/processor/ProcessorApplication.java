package com.yao.ioc.processor;

import com.yao.ioc.processor.processor.UserFactoryPostProcessor;
import com.yao.ioc.processor.processor.UserPostProcessor;
import com.yao.ioc.processor.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingju.yao
 * @date 2019/11/03
 */
@Configuration
@ComponentScan
public class ProcessorApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ProcessorApplication.class);

        User user = ctx.getBean("user", User.class);
        System.out.println(user);

        ((AnnotationConfigApplicationContext) ctx).destroy();
    }

    @Bean
    public UserPostProcessor initUserPostProcessor() {
        return new UserPostProcessor();
    }

    @Bean
    public UserFactoryPostProcessor initUserFactoryPostProcessor() {
        return new UserFactoryPostProcessor();
    }
}
