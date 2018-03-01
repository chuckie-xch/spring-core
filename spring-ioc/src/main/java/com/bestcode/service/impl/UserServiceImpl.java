package com.bestcode.service.impl;

import com.bestcode.annotation.MyAutowired;
import com.bestcode.dao.impl.LogDaoImpl;
import com.bestcode.dao.impl.UserDaoImpl;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.01
 */
public class UserServiceImpl {

    @MyAutowired
    private UserDaoImpl userDaoImpl;

    private LogDaoImpl logDaoImpl;

    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @MyAutowired
    public void setLogDaoImpl(LogDaoImpl logDaoImpl) {
        this.logDaoImpl = logDaoImpl;
    }

    public void show() {
        userDaoImpl.show();
        logDaoImpl.show();
    }
}
