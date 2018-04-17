package com.tonggu.cloud.eureka.user.service;

import com.tonggu.cloud.eureka.user.model.Order;

public interface CustomerService {

	public Order findByIdByEurekaServer(Long id);
	
	public Order fallback(Long id);
}
