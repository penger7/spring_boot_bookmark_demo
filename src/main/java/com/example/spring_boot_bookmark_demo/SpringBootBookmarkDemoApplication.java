package com.example.spring_boot_bookmark_demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBookmarkDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootBookmarkDemoApplication.class, args);
	}

	public void say(){
		System.out.println("hello");
	}
}
