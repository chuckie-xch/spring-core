package com.bestcode.spring.ioc.dependency;

import com.bestcode.entity.Command;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
public class CommandManager implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void process(Map commandState) {
        Command command = createCommand();
        command.setCommandState(commandState);
        command.execute();
    }

    protected Command createCommand() {
        return this.applicationContext.getBean("command", Command.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
