/** 
 * Project Name:guava-event <br/> 
 * File Name:ExceptionHandlerException.java <br/> 
 * Package Name:com.example.demo.event.start6 <br/> 
 * Date:2019年12月29日下午11:59:55 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 * 
 */
package com.example.demo.event.start6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;

/**
 * Project Name:guava-event <br/>
 * File Name:ExceptionHandlerException.java <br/>
 * Package Name:com.example.demo.event.start6 <br/>
 * Date:2019年12月29日下午11:59:55 <br/>
 * 
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8
 * 
 */
public class ExceptionHandlerEventBus {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerEventBus.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus(new ExceptionHandler());
		eventBus.register(new ExceptionListener());
		eventBus.post("exception post");

	}

	static class ExceptionHandler implements SubscriberExceptionHandler {

		@Override
		public void handleException(Throwable exception, SubscriberExceptionContext context) {
			LOGGER.info(JSON.toJSONString(context.getEvent()));
			LOGGER.info(JSON.toJSONString(context.getEventBus()));
			LOGGER.info(JSON.toJSONString(context.getSubscriber()));
			LOGGER.info(JSON.toJSONString(context.getSubscriberMethod()));
		}
	}

}
