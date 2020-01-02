/**
 * Project Name:guava-event <br/>
 * File Name:QueryListener.java <br/>
 * Package Name:com.example.demo.event.start9 <br/>
 * Date:2019年12月30日上午8:53:10 <br/>
 * Copyright (c) 2019<br/>
 * Author: qiaozhi@58.com All Rights Reserved. <br/>
 */
package com.example.demo.event.start9;

import com.example.demo.event.start9.dto.Request;
import com.example.demo.event.start9.dto.Response;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project Name:guava-event <br/>
 * File Name:QueryListener.java <br/>
 * Package Name:com.example.demo.event.start9 <br/>
 * Date:2019年12月30日上午8:53:10 <br/>
 *
 * @author qiaozhi@58.com
 * @since JDK 1.8
 */
public class RpcQueryListener {
    private final static Logger LOGGER = LoggerFactory.getLogger(RpcQueryListener.class);

    private final EventBus eventBus;

    public RpcQueryListener(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    /**
     * mock 查询保司
     *
     * @param request
     */
    @Subscribe
    public void doQuery(Request request) {
        LOGGER.info("QueryListener doQuery orderNo [{}]", request.toString());
        boolean result = true;
        if (result) {
            Response response = new Response();
            response.setCode("0000");
            response.setMsg("成功");
            eventBus.post(response);
        }
    }
}
