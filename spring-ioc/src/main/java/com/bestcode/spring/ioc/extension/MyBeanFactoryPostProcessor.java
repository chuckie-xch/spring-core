package com.bestcode.spring.ioc.extension;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.02
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered{

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor..");
    }

    public int getOrder() {
        return 0;
    }

    @Test
    public void testPropertyConfigure() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/config-metadata.xml");
        MyDataSource dataSource = context.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getContext());
    }
}
