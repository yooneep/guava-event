/** 
 * Project Name:guava-event <br/> 
 * File Name:ExceptionEventBus.java <br/> 
 * Package Name:com.example.demo.event.start6 <br/> 
 * Date:2019年12月29日下午11:58:03 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 * 
 */
package com.example.demo.event.start6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.EventBus;

/**
 * Project Name:guava-event <br/>
 * File Name:ExceptionEventBus.java <br/>
 * Package Name:com.example.demo.event.start6 <br/>
 * Date:2019年12月29日下午11:58:03 <br/>
 * 
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8
 * 
 */
public class ExceptionEventBus {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionEventBus.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		eventBus.register(new ExceptionListener());
		eventBus.post("exception post");
		LOGGER.info("===============end");
	}

}
