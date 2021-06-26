package com.khauminhduy.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumer {

	public static void main(String[] args) {

		List<String> numberStrings = Arrays.asList("one", "two", "three", "four", "five");
		
		List<String> result = new ArrayList<String>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = result::add;
		numberStrings.forEach(c1.andThen(c2));
		
		System.out.println("\n================================\n");
		result.forEach(System.out::println);
		
	}

}
