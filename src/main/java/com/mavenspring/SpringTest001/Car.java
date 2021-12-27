package com.mavenspring.SpringTest001;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public void drive() {
		System.out.println("Car driving!");
	}

}
