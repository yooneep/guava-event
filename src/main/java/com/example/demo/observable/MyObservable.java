package com.example.demo.observable;

import java.util.Observable;

/**
 * @ClassName: MyObservable
 * @Description: MyObservable
 * @Author: mic_saber@163.com
 * @Date: 2020/1/2 14:33
 * @Version: 1.0
 **/
public class MyObservable extends Observable {

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
