package com.example.demo.advance;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.*;

/**
 * @ClassName: EventBusFactory
 * @Description: EventBusFactory
 * @Author: qiaozhi@58.com
 * @Date: 2020/1/2 17:05
 * @Version: 1.0
 **/
public class EventBusFactory {
    private static final EventBusFactory factory = new EventBusFactory();

    private final EventBus eventBus;

    private EventBusFactory() {
        eventBus = new AsyncEventBus("AsyncEventBus", getMore());
    }

    public static final EventBusFactory getDefault() {
        return factory;
    }

    public EventBus eventBus() {
        return eventBus;
    }
    Executor getMore(){
        return new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
    }
}
