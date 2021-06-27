package com.khauminhduy.datetimeapi;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		
		System.out.println("Hello world");
		for(int i = 0; i < 10; i++) {
			System.out.println("hello " + i);
		}
		
		Instant instant2 = Instant.now();
		
		Duration duration = Duration.between(instant, instant2);
		
		long millis = duration.toMillis();
		
		System.out.println(millis);
		
		
	}

}
