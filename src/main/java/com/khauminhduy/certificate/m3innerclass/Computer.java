package com.khauminhduy.certificate.m3innerclass;

public class Computer {

	public class Processes {
		public void send() {
			serialNumber = 100;
			System.out.println(serialNumber);
		}
	}
	
	public static class Mouse {
		public static void print() {
			System.out.println(name);
		}
	}
	
	private abstract class Processor {
		
	}
	
	protected interface Pluggable {
		
	}
	
	enum PORTS {
		USB, USB3, ESATA, HDMI
	}
	
	private static String name = "Minh Duy";
	
	private int serialNumber;
	
	public void executeCommand() {
		
	}
	
	public static void main(String[] args) {
		Computer.Mouse mouse = new Computer.Mouse();
		Mouse.print();
		
	}
}