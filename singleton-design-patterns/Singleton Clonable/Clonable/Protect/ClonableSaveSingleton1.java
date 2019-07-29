package DesignPatterns;

public class ClonableSaveSingleton1 extends SuperClass {
	
	public static ClonableSaveSingleton1 singleton = new ClonableSaveSingleton1();
	
	private ClonableSaveSingleton1() {

	}
	

//Rather creating a new Object, throw an exception when ever they try to craete an object
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
