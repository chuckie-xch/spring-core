package com.bestcode.spring.ioc.config.bean;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.02
 */
public class UserServiceImpl implements UserService {

    private String desc = "userServiceImpl";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "userServiceImpl{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
