/** 
 * Project Name:guava-event <br/> 
 * File Name:InheritEventEventBus.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:07:35 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 * 
 */
package com.example.demo.event.start5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.eventbus.EventBus;

/**
 * Project Name:guava-event <br/>
 * File Name:InheritEventEventBus.java <br/>
 * Package Name:com.example.demo.event.start5 <br/>
 * Date:2019年12月29日下午11:07:35 <br/>
 * 
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8
 * 
 */
public class InheritEventEventBus {
	private static final Logger LOGGER = LoggerFactory.getLogger(InheritEventEventBus.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		eventBus.register(new CustomerListener());
		eventBus.post(new Food("板面"));
		LOGGER.info("============================");
		eventBus.post(new Bread("7-11"));
	}

}
