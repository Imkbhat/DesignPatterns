package com.bob.hms.admin.common.pract.factory;

public class Server extends Computer{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu ) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
