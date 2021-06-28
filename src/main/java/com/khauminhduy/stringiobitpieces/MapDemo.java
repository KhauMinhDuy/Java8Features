package com.khauminhduy.stringiobitpieces;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import com.khauminhduy.streamapi.Person;

public class MapDemo {

	public static void main(String[] args) {
		List<Person> list1 = Arrays.asList(
				new Person("Khau Minh Duy", 23),
				new Person("Nguyen Van A", 23),
				new Person("Nguyen Van B", 22),
				new Person("Nguyen Van C", 22)
			);
		
		List<Person> list2 = Arrays.asList(
				new Person("Tran Van A", 23),
				new Person("Tran Van B", 23),
				new Person("Tran Van C", 22),
				new Person("Tran Van D", 22)
			);
		
		
		Map<Integer, List<Person>> map1 = mapByAge(list1);
		Map<Integer, List<Person>> map2 = mapByAge(list2);
		
		map1.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		
		System.out.println("\n ================================ \n");
		map2.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		
		
		System.out.println("\n ================================= \n");
		map2.entrySet().stream().forEach(entry -> {
			map1.merge(entry.getKey(), entry.getValue(), (v1, v2) -> {
				v1.addAll(v2);
				return v1;
			});
		});
		map1.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		
		
	}
	
	private static Map<Integer, List<Person>> mapByAge(List<Person> list) {
		return list.stream().collect(Collectors.groupingBy(Person::getAge));
	}
	
}
