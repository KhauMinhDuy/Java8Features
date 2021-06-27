package com.khauminhduy.stringiobitpieces;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(", ", "[ ", " ]");
		stringJoiner.add("Khau Minh Duy").add("Nguyen Van A").add("Nguyen Van B");
		String names = stringJoiner.toString();
		System.out.println(names);
		
		StringJoiner stringJoiner2 = new StringJoiner(", ");
		stringJoiner2.add("Khau Minh Duy").add("Nguyen Van A").add("Nguyen Van B");
		String names2 = stringJoiner2.toString();
		System.out.println(names2);
		
		String[] strings = {"One", "Two", "Three", "Four"};
		String join = String.join(", ", strings);
		System.out.println(join);
		
	}
	
}
