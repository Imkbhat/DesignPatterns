package com.bob.hms.admin.common.pract.factory;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "Computer [ RAM="+this.getRAM() +",CPU= "+this.getCPU()+ ", HDD="+this.getHDD()+"]";
	}
}
