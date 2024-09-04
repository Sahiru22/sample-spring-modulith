package com.example.demo_spring_modulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;

@SpringBootApplication
@Modulith
public class DemoSpringModuliApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringModuliApplication.class, args);
	}

}
