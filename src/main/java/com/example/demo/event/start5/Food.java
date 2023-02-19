/** 
 * Project Name:guava-event <br/> 
 * File Name:Food.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:04:54 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: mic_saber@163.com All Rights Reserved. <br/>
 * 
 */  
package com.example.demo.event.start5;

/** 
 * Project Name:guava-event <br/> 
 * File Name:Food.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:04:54 <br/> 
 * @author mic_saber@163.com
 * @version  
 * @since JDK 1.8 
 * 
 */
public class Food {

	private String name;

	/**
	 * @param name
	 */
	public Food(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + "]";
	}
}
