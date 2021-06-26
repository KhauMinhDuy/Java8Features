package com.khauminhduy.streamapi;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> list2 = Arrays.asList(2, 4, 6);
		List<Integer> list3 = Arrays.asList(3, 5, 7);
		
		List<List<Integer>> lists = Arrays.asList(list1, list2, list3);
		
		System.out.println(lists);
		
		System.out.println("\n ======================================= \n");
		lists.stream()
			 .flatMap(list -> list.stream())
			 .forEach(System.out::print);
		
	}

}
