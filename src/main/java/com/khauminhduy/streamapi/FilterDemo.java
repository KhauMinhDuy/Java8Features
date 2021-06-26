package com.khauminhduy.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Stream<String> numberStrings = Stream.of("one", "two", "three", "four", "five");
		numberStrings
				.filter(number -> number.length() > 3)
				.forEach(System.out::println);
		
		System.out.println("\n==================================\n");
		List<String> lists = new ArrayList<>();
		List<String> numbers = Arrays.asList("one", "two", "three", "four", "five");
		numbers.stream()
			   .peek(System.out::println)
			   .filter(number -> number.length() > 3)
			   .forEach(lists::add);
		System.out.println("Done!");
		System.out.println("Size : " + lists.size());
	}

}
