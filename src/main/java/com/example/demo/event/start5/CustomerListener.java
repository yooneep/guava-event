/** 
 * Project Name:guava-event <br/> 
 * File Name:CustomerListener.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:02:02 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 * 
 */  
package com.example.demo.event.start5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.Subscribe;

/** 
 * Project Name:guava-event <br/> 
 * File Name:CustomerListener.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:02:02 <br/> 
 * @author mic_saber@163.com
 * @version  
 * @since JDK 1.8 
 * 
 */
public class CustomerListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerListener.class);
	@Subscribe
	public void eat(Food event) {
		LOGGER.info("eat:Received event [{}]", event.getName());
	}

	@Subscribe
	public void eat(Bread event) {
		LOGGER.info("eat:Received event [{}]", event.getName());
		
	}
}
