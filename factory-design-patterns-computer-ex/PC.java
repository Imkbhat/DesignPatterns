package com.bob.hms.admin.common.pract.factory;

public class PC extends Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PC(String ram, String hdd, String cpu) {
		this.ram =ram;
		this.cpu = cpu;
		this.hdd = hdd;
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
