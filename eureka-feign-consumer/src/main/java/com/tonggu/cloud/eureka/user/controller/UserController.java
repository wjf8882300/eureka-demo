package com.tonggu.cloud.eureka.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tonggu.cloud.eureka.user.model.OrderModel;
import com.tonggu.cloud.eureka.user.service.UserFeignService;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserFeignService userFeignService;
	
	@GetMapping("/sc/user/{id}")
	public OrderModel findByIdByEurekaServer(@PathVariable Long id) {
		return userFeignService.findOrderById(id);
	}
}
