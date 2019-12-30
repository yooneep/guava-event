/** 
 * Project Name:guava-event <br/> 
 * File Name:DeadEventListener.java <br/> 
 * Package Name:com.example.demo.event.start7 <br/> 
 * Date:2019年12月30日上午12:11:05 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */
package com.example.demo.event.start7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * Project Name:guava-event <br/>
 * File Name:DeadEventListener.java <br/>
 * Package Name:com.example.demo.event.start7 <br/>
 * Date:2019年12月30日上午12:11:05 <br/>
 * 
 * @author qiaozhi@58.com
 * @version
 * @since JDK 1.8
 * 
 */
public class DeadEventListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(DeadEventListener.class);

	@Subscribe
	public void m1(DeadEvent event) {
		LOGGER.info("============m1======= {}", event.getSource());
		LOGGER.info("============m1======= {}", event.getEvent());
	}
}
