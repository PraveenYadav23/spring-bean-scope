package com.praveen.springbeanscope.mvc1;

// bean configuration file

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.praveen.springbeanscope.bean", "com.praveen.springbeanscope.mvc1"})
public class AppConfig1 implements WebMvcConfigurer {
}
