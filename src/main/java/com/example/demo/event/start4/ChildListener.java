/** 
 * Project Name:guava-event <br/> 
 * File Name:ChildListener.java <br/> 
 * Package Name:com.example.demo.event.start4 <br/> 
 * Date:2019年12月29日下午10:40:57 <br/> 
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
 * File Name:ChildListener.java <br/> 
 * Package Name:com.example.demo.event.start4 <br/> 
 * Date:2019年12月29日下午10:40:57 <br/> 
 * @author qiaozhi@58.com 
 * @version  
 * @since JDK 1.8 
 * 
 */
public class ChildListener extends AbstractListener {
	private final static Logger LOGGER = LoggerFactory.getLogger(ChildListener.class);
	@Subscribe
	public void childAction(String event) {
		LOGGER.info("childAction:Received event [{}]", event);
	}
}
