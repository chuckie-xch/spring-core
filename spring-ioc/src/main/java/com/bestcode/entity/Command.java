package com.bestcode.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
public class Command {

    private Map commandState;

    public Map getCommandState() {
        return commandState;
    }

    public void setCommandState(Map commandState) {
        this.commandState = commandState;
    }

    public void execute() {
        System.out.println(this.hashCode());
        System.out.println("command execute ..");
    }
}
