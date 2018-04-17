package com.tonggu.cloud.eureka.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tonggu.cloud.eureka.user.model.Order;
import com.tonggu.cloud.eureka.user.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	// discoveryClient获取服务列表中，应用名为sc-eureka-first-provider一个服务注册信息
	public String serviceUrl() {
		List<ServiceInstance> list = discoveryClient
				.getInstances("eureka-provider");
		if (list != null && list.size() > 0) {
			return String.valueOf(list.get(0).getUri());
		}
		return null;
	}
	
	@HystrixCommand(fallbackMethod = "fallback")
	@Override
	public Order findByIdByEurekaServer(Long id) {
		String providerServiceUrl = serviceUrl();
		return this.restTemplate.getForObject(providerServiceUrl + "sc/order/" + id,
				Order.class);
	}

	@Override
	public Order fallback(Long id) {
		Order order = new Order();
		order.setOrderNo(111111L);
		return order;
	}

}
