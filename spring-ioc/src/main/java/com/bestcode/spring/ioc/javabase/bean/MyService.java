package com.bestcode.spring.ioc.javabase.bean;

/**
 * @author xch
 * @create 2018-03-04 15:09
 **/
public class MyService {

    private MyDao dao;

    private String desc = "default";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MyDao getDao() {
        return dao;
    }

    public void setDao(MyDao dao) {
        this.dao = dao;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
