package com.tonggu.cloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SpringConfigApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringConfigApplication.class).web(true).run(args);
	}

}
