package com.tonggu.cloud.eureka.user.model;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author xujin
 *
 */
@Data
public class Order {
	private Long orderNo;
	private Date createTime;
	private Date payTime;
}
