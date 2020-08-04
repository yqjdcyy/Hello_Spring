package com.yao.ioc.processor.processor;

import com.yao.ioc.processor.vo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 在实例化、依赖注入完成后，进行定制的初始化操作
 *
 * @author qingju.yao
 * @date 2019/11/03
 */
public class UserFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        User user = beanFactory.getBean("user", User.class);
        if (null != user) {
            user.setName("init-from-factory");
        }
    }
}
