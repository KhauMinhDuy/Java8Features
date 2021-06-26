package com.khauminhduy.lambdaexpression;

public interface DefaultMethodInterdace {
	
	default void greeting() {
		System.out.println("Greeting");
	}
	
	static void hello() {
		System.out.println("Hello");
	}

}
