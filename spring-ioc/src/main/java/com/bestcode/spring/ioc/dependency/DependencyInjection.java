package com.bestcode.spring.ioc.dependency;

import com.bestcode.entity.ExampleBean;
import com.bestcode.entity.SimpleMovieLister;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 依赖注入
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
public class DependencyInjection {

    /**
     * 构造方法注入，一般用于强制依赖的注入
     */
    @Test
    public void testConstructInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println(exampleBean);
    }

    /**
     * setter方法注入，一般用于可选依赖的注入
     */
    @Test
    public void testSetterInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(simpleMovieLister);
    }
}
