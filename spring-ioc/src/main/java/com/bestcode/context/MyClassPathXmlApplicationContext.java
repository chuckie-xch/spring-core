package com.bestcode.context;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.config.BeanDefinition;

import java.util.*;
import java.util.logging.Logger;

/**
 * 自定义ApplicationContext
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.03.01
 */
public class MyClassPathXmlApplicationContext {

    List<BeanDefinition> beanList = new ArrayList<BeanDefinition>();

    Map<String, Object> singletons = new HashMap<String, Object>();

    public MyClassPathXmlApplicationContext(String name) {
        readXML(name);
        // 实例化bean
        instantiateBean();
        // 注解注入
        annotationInject();
    }

    private void annotationInject() {
        // todo
    }

    private void instantiateBean() {

        // todo
    }

    /**
     * 读取配置文件
     *
     * @param name
     */
    private void readXML(String name) {
        Document document = null;
        SAXReader reader = new SAXReader();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            document = reader.read(classLoader.getResourceAsStream(name));
            Element beans = document.getRootElement();
            for (Iterator<Element> beansList = beans.elementIterator(); beansList.hasNext(); ) {
                Element element = beansList.next();
                // todo
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
