package com.bestcode.entity;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.27
 */
public class ClientService {

    private static ClientService clientService = new ClientService();

    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }

    @Override
    public String toString() {
        return "this is clientService";
    }
}
