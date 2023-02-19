/**
 * Project Name:guava-event <br/>
 * File Name:DirectExecutor.java <br/>
 * Package Name:com.example.demo.event.think <br/>
 * Date:2019年12月30日下午10:30:59 <br/>
 * Copyright (c) 2019<br/>
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 */
package com.example.demo.event.think;

import java.util.concurrent.Executor;


/**
 * Project Name:guava-event <br/> 
 * File Name:DirectExecutor.java <br/> 
 * Package Name:com.example.demo.event.think <br/> 
 * Date:2019年12月30日下午10:30:59 <br/> 
 * @author mic_saber@163.com
 * @version
 * @since JDK 1.8 
 *
 */
public enum DirectExecutor implements Executor {
	/**
	 * 实例
	 */
    INSTANCE;

    @Override
    public void execute(Runnable command) {
        command.run();
    }

    @Override
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }
}
