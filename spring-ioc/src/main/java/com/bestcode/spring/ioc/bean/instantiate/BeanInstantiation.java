package com.bestcode.spring.ioc.bean.instantiate;

import com.bestcode.entity.ClientService;
import com.bestcode.entity.ServerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean 初始化
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.27
 */
public class BeanInstantiation {

    /**
     * 静态工厂初始化
     */
    @Test
    public void testStaticFactoryInstantiate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        ClientService clientService = context.getBean("clientService", ClientService.class);
        System.out.println(clientService);
    }

    /**
     * 实例工厂初始化
     */
    @Test
    public void testInstanceFactoryInstantiate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application.xml");
        ServerService serverService = context.getBean("serverService", ServerService.class);
        System.out.println(serverService);
    }
}
