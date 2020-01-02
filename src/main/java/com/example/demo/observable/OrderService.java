package com.example.demo.observable;

/**
 * @ClassName: OrderService
 * @Description: 订单下单类
 * @Author: pangning@58.com
 * @Date: 2020/1/2 14:48
 * @Version: 1.0
 **/
public class OrderService {

    private static final String SUCCESS_MESSAGE = "李二狗拼多多拼单成功！";

    public static void main(String[] args) {
        // Order deal
        // ......
        // result
        new Topic().notify(SUCCESS_MESSAGE);
    }
}
