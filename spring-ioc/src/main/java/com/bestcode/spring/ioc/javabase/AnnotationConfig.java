package com.bestcode.spring.ioc.javabase;

import java.util.Iterator;

import javax.print.attribute.standard.RequestingUserName;

import com.bestcode.spring.ioc.javabase.bean.MyDao;
import com.bestcode.spring.ioc.javabase.bean.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author xch
 * @create 2018-03-04 15:08
 **/
@Configuration
public class AnnotationConfig {


    @Bean
    public MyService myService(MyDao dao) {
        MyService service = new MyService();
        service.setDao(dao);
        return service;
    }

    @Bean
    public MyDao myDao() {
        return new MyDao();
    }

    @Test
    public void testAnnotationContext() {
        ApplicationContext context= new AnnotationConfigApplicationContext(AnnotationConfig.class);
        MyService service = context.getBean("myService", MyService.class);
        System.out.println(service);
    }

    @Test
    public void testRegister() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(this.getClass());
        context.refresh();
        MyService service = context.getBean("myService", MyService.class);
        System.out.println(service.getDao());
        System.out.println(service);
    }
}
