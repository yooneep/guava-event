package com.example.demo.observable;

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

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("SendNoticeService send： " + arg.toString());
    }
}
