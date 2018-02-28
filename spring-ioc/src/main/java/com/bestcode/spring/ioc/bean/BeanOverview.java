package com.bestcode.spring.ioc.bean;

import com.bestcode.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.26
 */
public class BeanOverview {

    @Test
    public void testNaming() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        Person person = context.getBean("people", Person.class);
        System.out.println(person);
    }

    @Test
    public void testBeanAlias() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        Person person = context.getBean("beans-person", Person.class);
        System.out.println(person);
    }
}
