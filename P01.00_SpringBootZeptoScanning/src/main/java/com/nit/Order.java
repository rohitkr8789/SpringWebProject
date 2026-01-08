package com.nit;

import org.springframework.stereotype.Component;

@Component
public class Order {

	public Order() {
		System.out.println("Order Object :: in onther package");
	}
}
