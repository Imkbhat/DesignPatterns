package com.bob.hms.admin.common.pract;

public class SingletonLazyInitialization {
	
	private static SingletonLazyInitialization singletonObj = null;
	
	private SingletonLazyInitialization() {
		
	}
	
	public SingletonLazyInitialization getInstance() {
			if (null == singletonObj) {
				singletonObj = new SingletonLazyInitialization();
			}
		return singletonObj;
	}

}
