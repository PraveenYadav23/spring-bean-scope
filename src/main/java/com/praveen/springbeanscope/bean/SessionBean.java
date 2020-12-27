package com.praveen.springbeanscope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBean {

    private String str = "XYZ";

    public SessionBean() {
        System.out.println("Session Bean Obj created");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


}
