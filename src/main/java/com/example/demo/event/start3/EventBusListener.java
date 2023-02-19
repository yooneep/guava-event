/** 
 * Project Name:guava-event 
 * File Name:EventBusListener.java 
 * Package Name:com.example.demo.event.start 
 * Date:2019年12月29日下午12:58:02 
 * Copyright (c) 2019
 * Author: mic_saber@163.com All Rights Reserved.
 * 
 */
package com.example.demo.event.start3;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.Subscribe;

/**
 * Project Name:guava-event <br/>
 * File Name:EventBusListener.java <br/>
 * Package Name:com.example.demo.event.start <br/>
 * Date:2019年12月29日下午1:01:45 <br/>
 * 
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8
 *
 */
public class EventBusListener {
	private static Logger LOGGER = LoggerFactory.getLogger(EventBusListener.class);

	@Subscribe
	public void doAction(String event) {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LOGGER.info("doAction:Received event [{}]", event);
	}

	@Subscribe
	public void doAction1(String event) {
		LOGGER.info("doAction1:Received event [{}]", event);
	}

	@Subscribe
	public void doAction2(String event) {
		LOGGER.info("doAction2:Received event [{}]", event);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Subscribe
	public void doAction3(String event) {
		LOGGER.info("doAction3:Received event [{}]", event);
	}

	@Subscribe
	public void doAction4(String event) {
		LOGGER.info("doAction4:Received event [{}]", event);
	}
}
