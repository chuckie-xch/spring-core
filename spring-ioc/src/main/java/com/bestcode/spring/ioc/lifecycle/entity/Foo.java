package com.bestcode.spring.ioc.lifecycle.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.02
 */
public class Foo implements InitializingBean, DisposableBean{

    private String des = "foo";

    public void setDes(String des) {
        this.des = des;
    }

    @PostConstruct
    public void initWithAnnotation() {
        System.out.println("init by @PostConstruct");
    }

    @PreDestroy
    public void destroyWithAnnotation() {
        System.out.println("destroy by @PreDestroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("init by InitializingBean's afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("destroy by DisposableBean' destroy");
    }

    public void initMethod() {
        System.out.println("init by init-method");
    }

    public void destroyMethod() {
        System.out.println("destroy by destroy-method");
    }

    @Override
    public String toString() {
        return "Foo{" +
                "des='" + des + '\'' +
                '}';
    }
}
