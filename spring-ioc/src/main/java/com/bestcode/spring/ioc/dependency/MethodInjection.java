package com.bestcode.spring.ioc.dependency;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
public class MethodInjection {

    @Test
    public void testMethodInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        CommandManager commandManager = context.getBean("commandManager", CommandManager.class);
        Map map = new HashMap();
        commandManager.process(map);
        commandManager.process(map);
    }

    @Test
    public void testLookupMethodInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        LookupCommandManager commandManager = context.getBean("lookupCommandManager", LookupCommandManager.class);
        Map map = new HashMap();
        commandManager.process(map);
        commandManager.process(map);
    }
}
