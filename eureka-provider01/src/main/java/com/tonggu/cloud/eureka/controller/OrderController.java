package com.tonggu.cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tonggu.cloud.eureka.model.OrderModel;
import com.tonggu.cloud.eureka.service.OrderService;

/**
 * OrderController
 * @author xujin
 *
 */
@RefreshScope
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Value("${info.profile}")
	private String profile;

	@GetMapping("/sc/order/{id}")
	public OrderModel findOrderById(@PathVariable Long id) {
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		OrderModel orderModel = orderService.findOrderByOrderId(id);
		return orderModel;
	}

    @RequestMapping("/profile")
    public String profile() {
	   return this.profile;
	}

}
