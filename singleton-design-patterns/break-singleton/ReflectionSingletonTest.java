package com.bob.hms.admin.common.pract;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		SingletonEagerInitialization singletonObjOne = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization singletonObjTwo = null;
		
		try {
			Constructor[] constructors = SingletonEagerInitialization.class.getDeclaredConstructors();
			for  (Constructor cons : constructors) {
				cons.setAccessible(true);
				singletonObjTwo = (SingletonEagerInitialization)cons.newInstance();
				break;
			}
		}  catch (Exception e) {
			throw new RuntimeException("Some Exception");
		}
		
		System.out.println(singletonObjOne.hashCode());
        System.out.println(singletonObjTwo.hashCode());
	}
	
	/*
	 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
	 */

}
