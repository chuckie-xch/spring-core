package com.bestcode.entity;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
public class DefaultServiceLocator {

    private static ServerService serverService = new ServerService();

    public ServerService createServerServiceInstance() {
        return serverService;
    }
}
