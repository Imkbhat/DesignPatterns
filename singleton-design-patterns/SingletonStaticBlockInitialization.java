package com.bob.hms.admin.common.pract;

import javax.management.RuntimeErrorException;

public class SingletonStaticBlockInitialization {

	private static SingletonStaticBlockInitialization singletonObj = null;
	
	private SingletonStaticBlockInitialization () {};
	
	static {
		try {
			singletonObj = new SingletonStaticBlockInitialization();
		} catch(Exception ex) {
			throw new RuntimeException("Some Exception occured at runtime");
		}
	}
	
	public SingletonStaticBlockInitialization getInstance() {
		return singletonObj;
	}
}
