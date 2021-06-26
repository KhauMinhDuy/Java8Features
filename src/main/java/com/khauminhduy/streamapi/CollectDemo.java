package com.khauminhduy.streamapi;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toCollection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Khau Minh Duy", 23), 
				new Person("Nguyen Van A", 24),
				new Person("Nguyen Van B", 25), 
				new Person("Nguyen Van C", 23),
				new Person("Khau Minh Auy", 23)
			);

		String peopleName = people.stream().filter(person -> person.getAge() > 22).map(Person::getName)
				.collect(Collectors.joining(", "));

		System.out.println(peopleName);

		System.out.println("\n ================================= \n");

		Map<Integer, List<Person>> map = people.stream()
				.filter(person -> person.getAge() > 22)
				.collect(groupingBy(Person::getAge));

		map.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});

		System.out.println("\n ============================ \n");
		Map<Integer, Long> map2 = people.stream()
				.filter(person -> person.getAge() > 22)
				.collect(groupingBy(Person::getAge, counting()));

		map2.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});

		System.out.println("\n ============================ \n");
		Map<Integer, List<String>> map3 = people.stream()
				.filter(person -> person.getAge() > 22)
				.collect(
					groupingBy(
						Person::getAge, 
						mapping(Person::getName, Collectors.toList())
					)
				);
		map3.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		
		System.out.println("\n ===============================\n ");
		Map<Integer, TreeSet<String>> map4 = people.stream()
				.filter(person -> person.getAge() > 22)
				.collect(
					groupingBy (
						Person::getAge, 
						mapping(Person::getName, toCollection(TreeSet::new))
					)
				);
		map4.forEach((key, value) -> {
			System.out.println(key + " | " + value);
		});
		

	}

}
