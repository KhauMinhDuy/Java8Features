package com.khauminhduy.stringiobitpieces;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Khau ").append("Minh ").append("Duy.");
		String name = stringBuilder.toString();
		System.out.println(name);
	}

}
