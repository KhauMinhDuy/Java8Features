package com.khauminhduy.stringiobitpieces;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Khau ").append("Minh ").append("Duy.");
		String name = stringBuffer.toString();
		System.out.println(name);
	}

}
