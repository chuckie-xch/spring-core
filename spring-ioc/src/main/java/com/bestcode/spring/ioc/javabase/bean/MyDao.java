package com.bestcode.spring.ioc.javabase.bean;

/**
 * @author xch
 * @create 2018-03-04 15:36
 **/
public class MyDao {

    private String desc = "default dao";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "MyDao{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
