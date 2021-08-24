package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {
//jenkins comment	
	
	public static void main(String[] args) {
		System.out.println("welcome!");
		fun();
		SpringApplication.run(Demo2Application.class, args);
	}
	public static void fun() {
		System.out.println("this is a function()");
	}

}
