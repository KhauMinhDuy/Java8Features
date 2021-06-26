package com.khauminhduy.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {

		// default
		FileFilter fileFilter = new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
			}
		};

		// Lambda expression
		FileFilter filterUsingLambda = file -> {
			return file.getName().endsWith(".java");
		};
		
		File file = new File("src/main/java/com/khauminhduy/lambdaexpression");
		
		File[] listFiles = file.listFiles(fileFilter);
		for (File f : listFiles) {
			System.out.println(f);
		}
		
		
		File[] listFilesUsingLambda = file.listFiles(filterUsingLambda);
		System.out.println("\n\nUsing Lambda Expression");
		for(File f : listFilesUsingLambda) {
			System.out.println(f);
		}
		
		File[] listFilesInlineLambda = file.listFiles(f -> {
			return f.getName().endsWith(".java");
		});
		System.out.println("\n\nUsing Inline Lambda");
		for(File f : listFilesInlineLambda) {
			System.out.println(f);
		}
		

	}
}
