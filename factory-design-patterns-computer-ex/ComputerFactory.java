package com.bob.hms.admin.common.pract.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String hdd, String ram, String cpu) {
		if (type.equalsIgnoreCase("pc")) {
			return new PC(ram, hdd, cpu);
		} else if (type.equalsIgnoreCase("server")) {
			return new Server(ram, hdd, cpu);
		} else
			return null;
	}

}
