package com.example.demo.observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Test
 * @Description: Test
 * @Author: pangning@58.com
 * @Date: 2020/1/2 11:29
 * @Version: 1.0
 **/
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);
    private static final String SUCCESS_MESSAGE = "李二狗拼多多拼单成功！";

    public static void main(String[] args) {
        // 1.create
        MyObservable observable = new MyObservable();

        // 2.register
        observable.addObserver(new SendNoticeService());

        new SendEmailService(observable);
        new SendMessageService(observable);

        boolean b = observable.hasChanged();
        LOGGER.info("================" + b);

        // 3.ready state
        observable.setChanged();

        // 4.notify
        // 从订单拼凑下单成功信息
        observable.notifyObservers(SUCCESS_MESSAGE);
    }
}
