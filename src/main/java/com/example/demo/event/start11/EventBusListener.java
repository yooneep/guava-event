/** 
 * Project Name:guava-event 
 * File Name:EventBusListener.java 
 * Package Name:com.example.demo.event.start 
 * Date:2019年12月29日下午12:58:02 
 * Copyright (c) 2019
 * Author: qiaozhi@58.com All Rights Reserved. 
 * 
 */
package com.example.demo.event.start11;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Project Name:guava-event <br/>
 * File Name:EventBusListener.java <br/>
 * Package Name:com.example.demo.event.start <br/>
 * Date:2019年12月29日下午1:01:45 <br/>
 * 
 * @author qiaozhi@58.com
 * @version
 * @since JDK 1.8
 *
 */
public class EventBusListener {
	private static Logger LOGGER = LoggerFactory.getLogger(EventBusListener.class);

	@Subscribe
	public void doAction(String event) {
		LOGGER.info("doAction  :Received event [{}]", event);
	}

	@Subscribe
	public void doAction1(String event) throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		LOGGER.info("doAction1 :Received event [{}]", event);
	}

	@Subscribe
	public void doAction2(String event) {
		LOGGER.info("doAction2  :Received event [{}]", event);
	}

	@Subscribe
	public void doAction3(String event) {
		LOGGER.info("doAction3  :Received event [{}]", event);
	}
}
