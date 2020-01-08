/** 
 * Project Name:guava-event 
 * File Name:EventBusStart.java 
 * Package Name:com.example.demo.event.start 
 * Date:2019年12月29日下午12:56:58 
 * Copyright (c) 2019
 * Author: mic_saber@163.com All Rights Reserved.
 * 
 */
package com.example.demo.event.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.EventBus;

/**
 * 
 * Project Name:guava-event <br/>
 * File Name:EventBusStart.java <br/>
 * Package Name:com.example.demo.event.start <br/>
 * Date:2019年12月29日下午1:01:20 <br/>
 * 
 * @author mic_saber@163.com
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
		final EventBus eventBus = new EventBus();
		eventBus.register(new EventBusListener());
		LOGGER.info("EventBusStart start");
		eventBus.post("Simple Event");
	}

}
