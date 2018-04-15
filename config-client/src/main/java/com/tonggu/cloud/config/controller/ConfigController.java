package com.tonggu.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${info.profile}")
	private String profile;
	
    @RequestMapping("/profile")
    public String profile() {
	   return this.profile;
	}
}
