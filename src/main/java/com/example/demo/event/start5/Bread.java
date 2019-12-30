/** 
 * Project Name:guava-event <br/> 
 * File Name:Bread.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:05:41 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */  
package com.example.demo.event.start5;

/** 
 * Project Name:guava-event <br/> 
 * File Name:Bread.java <br/> 
 * Package Name:com.example.demo.event.start5 <br/> 
 * Date:2019年12月29日下午11:05:41 <br/> 
 * @author qiaozhi@58.com 
 * @version  
 * @since JDK 1.8 
 * 
 */
public class Bread extends Food {

	/**
	 * @param name
	 */
	public Bread(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Bread [getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
