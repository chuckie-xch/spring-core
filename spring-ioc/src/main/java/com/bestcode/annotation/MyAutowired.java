package com.bestcode.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解，实现spring 自动注入
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.01
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAutowired {

    public String name() default "";

}
