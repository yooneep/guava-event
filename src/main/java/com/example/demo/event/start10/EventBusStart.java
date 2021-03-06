/** 
 * Project Name:guava-event 
 * File Name:EventBusStart.java 
 * Package Name:com.example.demo.event.start 
 * Date:2019年12月29日下午12:56:58 
 * Copyright (c) 2019
 * Author: qiaozhi@58.com All Rights Reserved. 
 * 
 */
package com.example.demo.event.start10;

import com.google.common.eventbus.EventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Project Name:guava-event <br/>
 * File Name:EventBusStart.java <br/>
 * Package Name:com.example.demo.event.start <br/>
 * Date:2019年12月29日下午1:01:20 <br/>
 * 
 * @author qiaozhi@58.com
 * @version
 * @since JDK 1.8
 *
 */
public class EventBusStart {
	private static final Logger LOGGER = LoggerFactory.getLogger(EventBusStart.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Dispatcher.perThreadDispatchQueue
		EventBus eventBus = new EventBus();
		eventBus.register(new EventBusListener());
		LOGGER.info("EventBusStart start");
		eventBus.post("Simple Event");
		eventBus.post("Simple Event2");
	}
	/**
	 * doAction  :Received event [Simple Event]
	 * doAction3  :Received event [Simple Event]
	 * doAction1 :Received event [Simple Event]
	 * doAction2  :Received event [Simple Event]
	 * doAction  :Received event [Simple Event2]
	 * doAction3  :Received event [Simple Event2]
	 * doAction1 :Received event [Simple Event2]
	 * doAction2  :Received event [Simple Event2]
	 */
}
