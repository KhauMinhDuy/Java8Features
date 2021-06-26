package com.khauminhduy.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer sum = numbers.stream()
			   .reduce(0, Integer::sum);
		System.out.println(sum);
		
		Optional<Integer> max = numbers.stream()
			   .reduce(Integer::max);
		
		max.ifPresentOrElse(System.out::println, () -> System.out.println("Not Value"));
		
		Optional<Integer> min = numbers.stream()
			   .reduce(Integer::min);
		
		min.ifPresentOrElse(System.out::println, () -> System.out.println("Not Value"));
	}

}
