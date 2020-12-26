package com.praveen.springbeanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Bean("personSingleton")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person getPersonSingleton(){
        return new Person();
    }

    @Bean("personPrototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person getPersonPrototype(){
        return new Person();
    }
}
