package com.tonggu.cloud.eureka.service;

import com.tonggu.cloud.eureka.model.OrderModel;

/**
 * 
 * @author xujin
 *
 */
public interface OrderService {
	public OrderModel findOrderByOrderId(Long orderId);
}
