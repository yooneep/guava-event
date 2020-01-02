package com.example.demo.advance.test;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Listener
 * @Description: Listener
 * @Author: qiaozhi@58.com
 * @Date: 2020/1/2 17:10
 * @Version: 1.0
 **/
@Service
public class Listener {
    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);
    @Subscribe
    public void listen(String request) {
        LOGGER.info("===== : " + request);
    }
}
