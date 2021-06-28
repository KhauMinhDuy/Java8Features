package com.khauminhduy.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		Optional<Integer> max = numbers.stream().reduce(Integer::max);

		max.ifPresent(System.out::println);

		Optional<Integer> min = numbers.stream().reduce(Integer::min);

		min.ifPresent(System.out::println);

		Optional<Integer> max2 = numbers.stream().max(Integer::max);
		Optional<Integer> min2 = numbers.stream().min(Integer::min);
		
		long count = numbers.stream().count();
		System.out.println(count);
		
		Optional<Integer> max3 = numbers.stream().max(Comparator.naturalOrder());
		Optional<Integer> min3 = numbers.stream().min(Comparator.naturalOrder());
		

	}

}
