package com.praveen.springbeanscope.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * singleton scope means the container creates a single instance of that bean,
 * and all requests for that bean name will return the same object, which is cached.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

    private int num = 0;

    public SingletonBean() {
        System.out.println("Singleton bean Obj created");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
