package com.bestcode.spring.ioc.container;

import com.bestcode.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 初始化ioc容器
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.26
 */
public class InstantiateContainer {

    @Test
    public void testInstantiate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }


}
