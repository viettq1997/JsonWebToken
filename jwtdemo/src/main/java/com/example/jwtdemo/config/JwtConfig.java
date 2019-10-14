package com.example.jwtdemo.config;

import com.example.jwtdemo.handler.JWTFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    @Autowired
    private JWTFilter jwtFilter;

    @Bean
    public FilterRegistrationBean<JWTFilter> filterRegistrationBean() {
        FilterRegistrationBean<JWTFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(jwtFilter);
        filterRegistrationBean.addUrlPatterns("/secured/*");
        return filterRegistrationBean;
    }
}
