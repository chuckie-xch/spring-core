package com.bestcode.entity;

import org.springframework.beans.factory.annotation.Required;

/**
 * POJO 测试Spring DI
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.28
 */
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    /**
     * 使用Spring 的@Required注解，指定强制setter依赖，如果xml中未配置会提示，但是运行不会出错
     * @param movieFinder
     */
    @Required
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "movieFinder=" + movieFinder +
                '}';
    }
}
