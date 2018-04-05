package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.example.demo2"})
public class SoapExampleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapExampleServerApplication.class, args);
	}
}
