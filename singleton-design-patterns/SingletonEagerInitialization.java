package com.bob.hms.admin.common.pract;

public class SingletonEagerInitialization {
	
	private static final SingletonEagerInitialization singletonObj  = new SingletonEagerInitialization();
	
	private SingletonEagerInitialization() {}
	
	public static SingletonEagerInitialization getInstance() {
		return singletonObj;
	}
}
