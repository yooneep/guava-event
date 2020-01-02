package com.example.demo.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: H5Client
 * @Description: 发短信提醒
 * @Author: pangning@58.com
 * @Date: 2020/1/2 11:28
 * @Version: 1.0
 **/
public class SendMessageService implements Observer {


    public SendMessageService(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("SendMessageService send： " + arg.toString());
    }
}
