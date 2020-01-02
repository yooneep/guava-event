/**
 * Project Name:guava-event <br/>
 * File Name:ThreadTest.java <br/>
 * Package Name:com.example.demo.event.think <br/>
 * Date:2019年12月30日下午10:29:22 <br/>
 * Copyright (c) 2019<br/>
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 */
package com.example.demo.event.think;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * @author mic_saber@163.com
 * @since JDK 1.8
 */
public class DirectThreadTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectThreadTest.class);

    private static final int LOOP = 10;

    public static void main(String[] args) {
        Executor executor = getDirect();

        int i = 0;
        while (i < LOOP) {
            executor.execute(() -> {
                LOGGER.info("11111111111111");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    LOGGER.error("error", e);
                }
            });
            i++;
        }
    }

    /**
     * single -> order
     *
     * @return
     */
    private static Executor getDirect() {
        return DirectExecutor.directExecutor();
    }
}
