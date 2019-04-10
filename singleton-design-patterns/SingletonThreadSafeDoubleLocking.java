package com.bob.hms.admin.common.pract;

public class SingletonThreadSafeDoubleLocking {
	
	private static SingletonThreadSafeDoubleLocking singletonObj = null;
	
	private SingletonThreadSafeDoubleLocking() {
		
	}
	
	public SingletonThreadSafeDoubleLocking getInstance() {
		synchronized (SingletonThreadSafeDoubleLocking.class) {
			if (null == singletonObj) {
				singletonObj = new SingletonThreadSafeDoubleLocking();
			}
			return singletonObj;
		}
	}

}
