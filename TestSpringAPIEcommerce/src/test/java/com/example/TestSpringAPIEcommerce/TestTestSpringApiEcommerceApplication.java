package com.example.TestSpringAPIEcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestSpringApiEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestSpringApiEcommerceApplication::main).with(TestTestSpringApiEcommerceApplication.class).run(args);
	}

}
