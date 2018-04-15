package com.tonggu.cloud.eureka.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tonggu.cloud.eureka.user.model.OrderModel;

@FeignClient(name="eureka-zuul")
public interface UserFeignService {

	@RequestMapping(value = "/provider/sc/order/{id}", method = RequestMethod.GET)
	public OrderModel findOrderById(@PathVariable("id") Long id); 
}
