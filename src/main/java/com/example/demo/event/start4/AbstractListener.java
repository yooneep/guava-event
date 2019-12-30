/** 
 * Project Name:guava-event <br/> 
 * File Name:AbstractListener.java <br/> 
 * Package Name:com.example.demo.event.start4 <br/> 
 * Date:2019年12月29日下午10:07:53 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */
package com.example.demo.event.start4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.eventbus.Subscribe;

/**
 * Project Name:guava-event <br/>
 * File Name:AbstractListener.java <br/>
 * Package Name:com.example.demo.event.start4 <br/>
 * Date:2019年12月29日下午10:07:53 <br/>
 * 
 * @author qiaozhi@58.com
 * @version
 * @since JDK 1.8
 * 
 */
public abstract class AbstractListener {
	private final static Logger LOGGER = LoggerFactory.getLogger(AbstractListener.class);

	@Subscribe
	public void baseAction(String event) {
		LOGGER.info("baseAction:Received event [{}]", event);
	}
}
