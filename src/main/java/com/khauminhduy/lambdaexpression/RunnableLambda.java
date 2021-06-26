package com.khauminhduy.lambdaexpression;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Hello world from thread [" + Thread.currentThread().getName() + "]");
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		thread.join();
		
		Runnable runnableUsingLambda = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello world from thread [" + Thread.currentThread().getName() + "]");
			}
		};
		
		Thread thread2 = new Thread(runnableUsingLambda);
		thread2.start();
		thread2.join();
		
		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello world from thread [" + Thread.currentThread().getName() + "]");
			}
		});
		
		thread3.start();
		thread3.join();
	}

}
