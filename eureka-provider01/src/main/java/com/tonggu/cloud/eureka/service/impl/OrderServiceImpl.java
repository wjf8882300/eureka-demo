package com.tonggu.cloud.eureka.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tonggu.cloud.eureka.entity.Order;
import com.tonggu.cloud.eureka.model.OrderModel;
import com.tonggu.cloud.eureka.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	public OrderModel findOrderByOrderId(Long orderId) {
		OrderModel orderModel = new OrderModel();
		if (orderId.equals(2L)) {
			Order order = new Order();
			order.setCreateTime(new Date());
			order.setOrderNo(2L);
			BeanUtils.copyProperties(order, orderModel);
		}
		return orderModel;
	}

}
