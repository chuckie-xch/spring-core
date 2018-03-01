package com.bestcode.entity;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.01
 */
public class ReplacementComputeValue implements MethodReplacer {

    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        String value =  (String) args[0];
        System.out.println("replace method: " + value);
        return null;
    }
}
