package com.khauminhduy.stringiobitpieces;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(", ");
		stringJoiner.add("Khau Minh Duy").add("Nguyen Van A").add("Nguyen Van B");
		String names = stringJoiner.toString();
		System.out.println(names);
	}
	
}
