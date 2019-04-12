package com.bob.hms.admin.common.pract.factory;

public class FactoryRunner {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		Computer pc = factory.getComputer("pc", "1024GB", "8GB", "2.4Ghz");
		Computer server = factory.getComputer("server", "1024TB", "100GB", "4.8Ghz");
		
		System.out.println("Server Configuration" + server);
		System.out.println("Pc Configuration" + pc);
	}

}
