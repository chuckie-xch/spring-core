package com.bestcode.spring.ioc.dependency;

import com.bestcode.entity.MyValueCalcultor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.01
 */
public class MethodReplace {


    @Test
    public void testReplaceMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        MyValueCalcultor myValueCalcultor = context.getBean("myValueCalcultor", MyValueCalcultor.class);
        myValueCalcultor.computeValue("hello");
    }

}
