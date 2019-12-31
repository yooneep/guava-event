/** 
 * Project Name:guava-event <br/> 
 * File Name:Request.java <br/> 
 * Package Name:com.example.demo.event.start9 <br/> 
 * Date:2019年12月30日下午11:20:12 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */  
package com.example.demo.event.start9.dto;

/** 
 * Project Name:guava-event <br/> 
 * File Name:Request.java <br/> 
 * Package Name:com.example.demo.event.start9 <br/> 
 * Date:2019年12月30日下午11:20:12 <br/> 
 * @author qiaozhi@58.com 
 * @version  
 * @since JDK 1.8 
 * 
 */
public class Request {
	private String orderNo;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	

	/**
	 * @param orderNo
	 */
	public Request(String orderNo) {
		super();
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "Request [orderNo=" + orderNo + "]";
	}
	
}
