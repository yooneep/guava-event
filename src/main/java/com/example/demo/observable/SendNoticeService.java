package com.example.demo.observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: SendNoticeService
 * @Description: 手机消息提醒
 * @Author: pangning@58.com
 * @Date: 2020/1/2 14:38
 * @Version: 1.0
 **/
public class SendNoticeService implements Observer {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendNoticeService.class);

    @Override
    public void update(Observable o, Object arg) {
        LOGGER.info("SendNoticeService send： " + arg.toString());
    }
}
