package com.khauminhduy.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		};
		
		List<String> numberStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven");
		numberStrings.stream()
					 .sorted(comparator)
					 .forEach(System.out::println);
		
		
		System.out.println("\n==================================\n");
		Comparator<String> comparatorUsingLambda = (s1, s2) -> {
			return s1.compareTo(s2);
		};
		
		numberStrings.stream()
					 .sorted(comparatorUsingLambda)
					 .forEach(System.out::println);
		
		System.out.println("\n==================================\n");
		numberStrings.stream()
					 .sorted((s1, s2) -> s1.compareTo(s2))
					 .forEach(System.out::println);
		
		System.out.println("\n==================================\n");
		numberStrings.stream()
					 .sorted(String::compareTo)
					 .forEach(System.out::println);
	}

}
