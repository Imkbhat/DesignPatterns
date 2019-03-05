package com.bob.hms.admin.common;

public class ObjectFactoryRunner {

	public static void main(String[] args) {
		OSObjectFactory factoryRunner = new OSObjectFactory();
		OS os = factoryRunner.getInstance("Windows");
		System.out.println("returning an Object ==>" +os.show());
	}
}
