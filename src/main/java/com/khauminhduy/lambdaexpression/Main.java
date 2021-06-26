package com.khauminhduy.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class Main {

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

	}
}
