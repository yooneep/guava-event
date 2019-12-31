/**
 * Project Name:guava-event <br/>
 * File Name:ThreadTest.java <br/>
 * Package Name:com.example.demo.event.think <br/>
 * Date:2019年12月30日下午10:29:22 <br/>
 * Copyright (c) 2019<br/>
 * Author: qiaozhi@58.com All Rights Reserved. <br/>
 */
package com.example.demo.event.think;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Project Name:guava-event <br/>
 * File Name:ThreadTest.java <br/>
 * Package Name:com.example.demo.event.think <br/>
 * Date:2019年12月30日下午10:29:22 <br/>
 *
 * @author qiaozhi@58.com
 * @since JDK 1.8
 */
public class MoreThreadTest {
    public static void main(String[] args) {
        Executor executor = getMore();

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                System.out.println("11111111111111");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
    }

    private static Executor getMore() {
        return new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
    }
}
