package com.tonggu.cloud.eureka.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringCloudApplication
public class SpringHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringHystrixApplication.class, args);
	}
}