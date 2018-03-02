package com.bestcode.spring.ioc.config.bean;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.02
 */
public class AdminServiceImpl implements UserService {

    private String desc = "adminServiceImpl";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "adminServiceImpl{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
