package com.praveen.springbeanscope.controller;

import com.praveen.springbeanscope.bean.RequestBean;
import com.praveen.springbeanscope.bean.SessionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class WebScopeTestController {

    @Autowired
    private RequestBean requestBean;
    @Autowired
    private SessionBean sessionBean;
    @Autowired
    private WebApplicationContext context;

    @RequestMapping("/requestBean1")
    public void testRequestBean(HttpServletResponse response) throws IOException {
        response.getWriter().write("Old value" + requestBean.getStr());
        requestBean.setStr("Good to know you");
        response.getWriter().write("New value"+ requestBean.getStr());

        //single requestBean instance will be created for the same request
        RequestBean requestBean1 = context.getBean("requestBean", RequestBean.class);
        RequestBean requestBean2 = context.getBean("requestBean", RequestBean.class);

        System.out.println(requestBean1 + " "+ requestBean2);
    }

    @RequestMapping("/requestBean2")
    public void testRequestBean2(HttpServletResponse response) throws IOException {
        response.getWriter().write("value if second request "+ requestBean.getStr());
    }

    @RequestMapping("/sessionBean1")
    public void testSessionBean(HttpServletResponse response) throws IOException {
        response.getWriter().write("Old value" + sessionBean.getStr());
        sessionBean.setStr("Good to know you");
        response.getWriter().write("New value"+ sessionBean.getStr());
    }

    @RequestMapping("/sessionBean2")
    public void testSessionBean2(HttpServletResponse response) throws IOException {
        response.getWriter().write("value if second request "+ sessionBean.getStr());
    }
}
