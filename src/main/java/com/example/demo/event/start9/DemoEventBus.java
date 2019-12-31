/** 
 * Project Name:guava-event <br/> 
 * File Name:DemoEventBus.java <br/> 
 * Package Name:com.example.demo.event.start9 <br/> 
 * Date:2019年12月30日上午8:50:50 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */
package com.example.demo.event.start9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.EventBus;

/**
 * Project Name:guava-event <br/>
 * File Name:DemoEventBus.java <br/>
 * Package Name:com.example.demo.event.start9 <br/>
 * Date:2019年12月30日上午8:50:50 <br/>
 * 
 * @author qiaozhi@58.com
 * @version
 * @since JDK 1.8
 * 
 */
public class DemoEventBus {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoEventBus.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		eventBus.register(new RpcQueryListener(eventBus));
		LOGGER.info("===============================");
		
		
		OrderServiceListener orderService = new OrderServiceListener(eventBus);
		orderService.query("123456789");

	}

}
