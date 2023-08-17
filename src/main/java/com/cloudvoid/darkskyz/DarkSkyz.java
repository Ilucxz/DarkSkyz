package com.cloudvoid.darkskyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cloudvoid")
public class DarkSkyz {

	public static void main(String[] args) {
		SpringApplication.run(DarkSkyz.class, args);
	}

}
