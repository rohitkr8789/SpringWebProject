package com.example.demo.payment;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Payment {

	public Payment() {
		System.out.println("Zepto inside Payment option");
	}
}
