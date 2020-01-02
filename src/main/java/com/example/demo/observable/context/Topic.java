package com.example.demo.observable.context;

import com.example.demo.observable.MyObservable;
import com.example.demo.observable.service.SendEmailService;
import com.example.demo.observable.service.SendMessageService;
import com.example.demo.observable.service.SendNoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Test
 * @Description: Test
 * @Author: qiaozhi@58.com
 * @Date: 2020/1/2 11:29
 * @Version: 1.0
 **/
public class Topic {
    private static final Logger LOGGER = LoggerFactory.getLogger(Topic.class);

    private MyObservable observable;

    public Topic() {
        // 1.create
        observable = new MyObservable();

        // 2.register
        observable.addObserver(new SendNoticeService());

        new SendEmailService(observable);
        new SendMessageService(observable);

        boolean b = observable.hasChanged();
        LOGGER.info("================" + b);
    }


    public void notify(String orderMessage){
        // 3.ready state
        observable.setChanged();

        // 4.notify
        // 从订单拼凑下单成功信息
        observable.notifyObservers(orderMessage);
    }
}
