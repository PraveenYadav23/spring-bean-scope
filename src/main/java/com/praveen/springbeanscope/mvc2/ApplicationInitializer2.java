package com.praveen.springbeanscope.mvc2;

import com.praveen.springbeanscope.mvc1.AppConfig1;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer2 implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(AppConfig2.class);

        //create a dispatcher servlet object
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // registered dispatcher servlet with servlet context
        ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet2", dispatcherServlet);

        myCustomDispatcherServlet.setLoadOnStartup(2);
        myCustomDispatcherServlet.addMapping("/app2/*");

    }
}
