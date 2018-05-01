package com.tonggu.cloud.eureka.user.service.impl;

import org.springframework.stereotype.Component;

import com.tonggu.cloud.eureka.user.model.OrderModel;
import com.tonggu.cloud.eureka.user.service.UserFeignService;

@Component
public class UserFeignServiceHystrix implements UserFeignService {

	@Override
	public OrderModel findOrderById(Long id) {
		// TODO Auto-generated method stub
		OrderModel model = new OrderModel();
		model.setOrderNo(5555L);
		return model;
	}

}
