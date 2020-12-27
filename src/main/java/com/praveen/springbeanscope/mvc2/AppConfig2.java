package com.praveen.springbeanscope.mvc2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.praveen.springbeanscope.bean", "com.praveen.springbeanscope.mvc2"})
public class AppConfig2 {
}
