package com.praveen.springbeanscope.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

// It will be visible at servletContext so global for entire application
@Component
@ApplicationScope
public class ApplicationBean {

    private int num = 0;

    public ApplicationBean() {
        System.out.println("Application Bean Obj Created");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
