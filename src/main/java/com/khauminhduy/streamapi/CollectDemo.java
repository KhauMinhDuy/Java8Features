package com.khauminhduy.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Khau Minh Duy", 23), 
				new Person("Nguyen Van A", 24),
				new Person("Nguyen Van B", 25),
				new Person("Nguyen Van C", 23)
			);
		
		String peopleName = people.stream()
				.filter(person -> person.getAge() > 22)
				.map(Person::getName)
				.collect(Collectors.joining(", "));
		
		System.out.println(peopleName);
		
		System.out.println("\n ================================= \n");
		
		Map<Integer, List<Person>> map = people.stream()
				.filter(person -> person.getAge() > 22)
				.collect(Collectors.groupingBy(Person::getAge));
		
		map.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		
		System.out.println("\n ============================ \n");
		Map<Integer, Long> map2 = people.stream()
				.filter(person -> person.getAge() > 22)
				.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		
		map2.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		
	}

}
