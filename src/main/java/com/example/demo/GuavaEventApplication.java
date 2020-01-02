package com.example.demo;

import com.example.demo.advance.EventBusFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuavaEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuavaEventApplication.class, args);
		EventBusFactory.getDefault().eventBus().post("嗯，发送了");
	}

}
