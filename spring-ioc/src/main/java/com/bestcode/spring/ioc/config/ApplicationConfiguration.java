package com.bestcode.spring.ioc.config;

import com.bestcode.spring.ioc.config.bean.AdminServiceImpl;
import com.bestcode.spring.ioc.config.bean.UserController;
import com.bestcode.spring.ioc.config.bean.UserService;
import com.bestcode.spring.ioc.config.bean.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.02
 */
@Configuration
@ComponentScan(basePackages = "com.bestcode.spring.ioc.config.bean", excludeFilters = @ComponentScan.Filter(Repository.class))
public class ApplicationConfiguration {


    @Bean
    @Qualifier("adminService")
    public UserService adminService() {
        return new AdminServiceImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserController userController(UserService adminService) {
        UserController controller = new UserController();
        controller.setUserService(adminService);
        return controller;
    }

    @Test
    public void testAnnotationConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfiguration.class);
        context.refresh();
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
    }

    @Test
    public void testQualifier() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfiguration.class);
        context.refresh();
        UserController controller = context.getBean("userController", UserController.class);
        System.out.println(controller);
    }
}
