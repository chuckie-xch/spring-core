package com.bestcode.spring.ioc.dependency;

import com.bestcode.entity.Command;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
@Component
public abstract class LookupCommandManager {

    public void process(Map commandState) {
        System.out.println("LookupCommandManager process..");
        Command command = createCommand();
        command.setCommandState(commandState);
        command.execute();
    }

    @Lookup("command")
    public abstract Command createCommand();
}
