package com.tonggu.cloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringConfigApplication.class).web(true).run(args);
	}

}
