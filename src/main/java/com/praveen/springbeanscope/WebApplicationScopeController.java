package com.praveen.springbeanscope;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebApplicationScopeController {

    private WebApplicationContextScope webApplicationContextScope;

    @RequestMapping("/scope/request")
    public String getRequestScopeBean() {
        return webApplicationContextScope.getRequestScopedBean().toString();
    }

    @RequestMapping("/scope/session")
    public String getSessionScopeBean() {
        return webApplicationContextScope.getSessionScopedBean().toString();
    }
}
