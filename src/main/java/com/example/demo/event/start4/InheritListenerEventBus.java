/** 
 * Project Name:guava-event <br/> 
 * File Name:InheritEventBus.java <br/> 
 * Package Name:com.example.demo.event.start4 <br/> 
 * Date:2019年12月29日下午10:49:13 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */  
package com.example.demo.event.start4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.eventbus.EventBus;

/** 
 * Project Name:guava-event <br/> 
 * File Name:InheritEventBus.java <br/> 
 * Package Name:com.example.demo.event.start4 <br/> 
 * Date:2019年12月29日下午10:49:13 <br/> 
 * @author qiaozhi@58.com 
 * @version  
 * @since JDK 1.8 
 * 
 */
public class InheritListenerEventBus {
	private static final Logger LOGGER = LoggerFactory.getLogger(InheritListenerEventBus.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		eventBus.register(new ChildListener());
		LOGGER.info("EventBusStart start");
		eventBus.post("Simple Event");

	}

}
