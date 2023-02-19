/** 
 * Project Name:guava-event <br/> 
 * File Name:ExceptionListener.java <br/> 
 * Package Name:com.example.demo.event.start6 <br/> 
 * Date:2019年12月29日下午11:34:39 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 * 
 */
package com.example.demo.event.start6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.Subscribe;

/**
 * Project Name:guava-event <br/>
 * File Name:ExceptionListener.java <br/>
 * Package Name:com.example.demo.event.start6 <br/>
 * Date:2019年12月29日下午11:34:39 <br/>
 * 
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8
 * 
 */
public class ExceptionListener {
	private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionListener.class);

	@Subscribe
	public void m1(String event) {
		LOGGER.info("============m1======={}", event);
		throw new RuntimeException();
	}

	@Subscribe
	public void m2(String event) {
		LOGGER.info("============m2======={}", event);
	}

	@Subscribe
	public void m3(String event) {
		LOGGER.info("============m3======={}", event);
	}
}
