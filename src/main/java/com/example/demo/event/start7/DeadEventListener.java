/**
 * Project Name:guava-event <br/>
 * File Name:DeadEventListener.java <br/>
 * Package Name:com.example.demo.event.start7 <br/>
 * Date:2019年12月30日上午12:11:05 <br/>
 * Copyright (c) 2019<br/>
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 */
package com.example.demo.event.start7;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project Name:guava-event <br/>
 * File Name:DeadEventListener.java <br/>
 * Package Name:com.example.demo.event.start7 <br/>
 * Date:2019年12月30日上午12:11:05 <br/>
 *
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8
 *
 */
public class DeadEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeadEventListener.class);

    @Subscribe
    public void getDeadEvent(DeadEvent event) {
        LOGGER.info("============getDeadEvent======= {}", JSON.toJSONString(event));
    }

//	@Subscribe
	public void getString(Integer event) {
		LOGGER.info("============getString======= {}", event);
	}
}
