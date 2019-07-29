package DesignPatterns;

public class SuperClass implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
