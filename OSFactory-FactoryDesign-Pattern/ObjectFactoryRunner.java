package com.bob.hms.admin.common;

public class ObjectFactoryRunner {

	public static void main(String[] args) {
		OSObjectFactory factoryRunner = new OSObjectFactory();
		OS os = factoryRunner.getInstance("IOS");
		System.out.println("returning an Object of ==>" +os);
	}
}
