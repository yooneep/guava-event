/**
 * Project Name:guava-event <br/>
 * File Name:OrderService.java <br/>
 * Package Name:com.example.demo.event.start9 <br/>
 * Date:2019年12月30日上午8:51:58 <br/>
 * Copyright (c) 2019<br/>
 * Author: qiaozhi@58.com All Rights Reserved. <br/>
 */
package com.example.demo.event.start9;

import com.alibaba.fastjson.JSON;
import com.example.demo.event.start9.dto.Request;
import com.example.demo.event.start9.dto.Response;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project Name:guava-event <br/>
 * File Name:OrderService.java <br/>
 * Package Name:com.example.demo.event.start9 <br/>
 * Date:2019年12月30日上午8:51:58 <br/>
 *
 * @author qiaozhi@58.com
 * @since JDK 1.8
 */
public class OrderServiceListener {
    private final static Logger LOGGER = LoggerFactory.getLogger(OrderServiceListener.class);

    private final EventBus eventBus;

    public OrderServiceListener(EventBus eventBus) {
        this.eventBus = eventBus;
        this.eventBus.register(this);
    }

    public void query(String orderNo) {
        LOGGER.info("Received the orderNo [{}]", orderNo);
        this.eventBus.post(new Request(orderNo));
    }

    @Subscribe
    public void handleResponse(Response response) {
        LOGGER.info("接收到保司返回结果为： {}", JSON.toJSONString(response, true));
    }
}
