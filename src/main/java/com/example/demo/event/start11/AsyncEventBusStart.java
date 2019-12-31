/** 
 * Project Name:guava-event 
 * File Name:EventBusStart.java 
 * Package Name:com.example.demo.event.start 
 * Date:2019年12月29日下午12:56:58 
 * Copyright (c) 2019
 * Author: qiaozhi@58.com All Rights Reserved. 
 * 
 */
package com.example.demo.event.start11;

import com.google.common.eventbus.AsyncEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
public class AsyncEventBusStart {
	private static final Logger LOGGER = LoggerFactory.getLogger(AsyncEventBusStart.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Dispatcher.perThreadDispatchQueue
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10,
				0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());
		final AsyncEventBus eventBus = new AsyncEventBus("庞宁",threadPoolExecutor);
		eventBus.register(new EventBusListener());
		LOGGER.info("EventBusStart start");
		eventBus.post("Simple Event");
		eventBus.post("Simple Event2");
	}
	/**
	 * doAction  :Received event [Simple Event]
	 * doAction3  :Received event [Simple Event]
	 * doAction2  :Received event [Simple Event]
	 * doAction2  :Received event [Simple Event2]
	 * doAction3  :Received event [Simple Event2]
	 * doAction  :Received event [Simple Event2]
	 * doAction1 :Received event [Simple Event]
	 * doAction1 :Received event [Simple Event2]
	 */
}
