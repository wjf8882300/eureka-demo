package com.tonggu.cloud.eureka.user;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import feign.RequestTemplate;

@Configuration
public class UserConsumerConfig extends WebMvcConfigurerAdapter {
	




}
