package com.praveen.springbeanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

public class WebApplicationContextScope {

    @Bean("requestScope")
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
//    @RequestScope
    public WebApplicationContextScope getRequestScopedBean() {
        return new WebApplicationContextScope();
    }

    @Bean("sessiomScope")
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//    @SessionScope
    public WebApplicationContextScope getSessionScopedBean() {
        return new WebApplicationContextScope();
    }
}
