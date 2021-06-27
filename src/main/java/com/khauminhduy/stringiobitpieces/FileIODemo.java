package com.khauminhduy.stringiobitpieces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileIODemo {

	public static void main(String[] args) {
		try (Stream<String> lines = Files.lines(Paths.get("src/main/resources/data.txt"));){
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
