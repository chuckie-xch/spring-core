package com.bestcode.spring.ioc.lifecycle;

import com.bestcode.spring.ioc.lifecycle.entity.Foo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring bean生命周期回调
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.02
 */
public class LifecycleCallback {

    private ConfigurableApplicationContext context;

    @Before
    public void initContext() {
        context = new ClassPathXmlApplicationContext("config/application.xml");
    }

    @Test
    public void testLifecycle() {
        Foo foo = context.getBean("foo", Foo.class);
        System.out.println(foo);
        context.registerShutdownHook();
    }


}
