package com.bob.hms.admin.common.pract;

public class SingletonThreadSafeInitialization {
	private static SingletonThreadSafeInitialization singletonObj = null;
	
	private SingletonThreadSafeInitialization() {}
	
	public synchronized SingletonThreadSafeInitialization getInstace() {
		if (null == singletonObj) {
			singletonObj = new SingletonThreadSafeInitialization();
		}
		return singletonObj;
	}
}
