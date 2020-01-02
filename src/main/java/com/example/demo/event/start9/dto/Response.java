package com.example.demo.event.start9.dto;

/**
 * 
 * Project Name:guava-event <br/> 
 * File Name:Response.java <br/> 
 * Package Name:com.example.demo.event.start9 <br/> 
 * Date:2019年12月30日上午8:59:13 <br/> 
 * @author mic_saber@163.com
 * @version  
 * @since JDK 1.8 
 *
 */
public class Response {
	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", msg=" + msg + "]";
	}

}
