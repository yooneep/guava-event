package com.example.demo.observable.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: H5Client
 * @Description: 发短信提醒
 * @Author: qiaozhi@58.com
 * @Date: 2020/1/2 11:28
 * @Version: 1.0
 **/
public class SendMessageService implements Observer {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendMessageService.class);

    public SendMessageService(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        LOGGER.info("SendMessageService send： " + arg.toString());
    }
}
