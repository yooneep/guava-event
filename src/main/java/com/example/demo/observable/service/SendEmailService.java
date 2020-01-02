package com.example.demo.observable.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: SendEmailService
 * @Description: 发送邮件
 * @Author: pangning@58.com
 * @Date: 2020/1/2 14:11
 * @Version: 1.0
 **/
public class SendEmailService implements Observer {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendEmailService.class);

    public SendEmailService(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        LOGGER.info("SendEmailService send： " + arg.toString());
    }
}
