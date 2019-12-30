/** 
 * Project Name:guava-event <br/> 
 * File Name:DeadEventBus.java <br/> 
 * Package Name:com.example.demo.event.start7 <br/> 
 * Date:2019年12月30日上午12:11:55 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */
package com.example.demo.event.start7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.EventBus;

/**
 * Project Name:guava-event <br/>
 * File Name:DeadEventBus.java <br/>
 * Package Name:com.example.demo.event.start7 <br/>
 * Date:2019年12月30日上午12:11:55 <br/>
 * 
 * @author qiaozhi@58.com
 * @version
 * @since JDK 1.8
 * 
 */
public class DeadEventBus {
	private static final Logger LOGGER = LoggerFactory.getLogger(DeadEventBus.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus("pangning's  event");
		eventBus.register(new DeadEventListener());
		eventBus.post("这是请求内容");
		LOGGER.info("===============end");
	}
}
