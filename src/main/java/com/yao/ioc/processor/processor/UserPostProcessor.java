package com.yao.ioc.processor.processor;

import com.yao.ioc.processor.vo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 针对 BeanFactory 的操作，加载 Bean 的定义（属性值为 null）
 *
 * @author qingju.yao
 * @date 2019/11/03
 */
public class UserPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            User user = (User) bean;
            user.setId(user.getId() + 1);
            user.setName(user.getName() + "-before");

            return user;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            User user = (User) bean;
            user.setId(user.getId() + 1);
            user.setName(user.getName() + "-after");

            return user;
        }
        return bean;
    }
}
