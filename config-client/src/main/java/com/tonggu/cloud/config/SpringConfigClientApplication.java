package com.tonggu.cloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringConfigClientApplication.class).web(true).run(args);
	}

}
