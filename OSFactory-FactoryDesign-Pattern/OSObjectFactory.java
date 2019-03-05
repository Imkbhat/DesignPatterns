package com.bob.hms.admin.common;

public class OSObjectFactory {
	
	public OS getInstance(String osType) {
		if (osType.equals("Android")) {
			return new AndroidOs();
		} else if (osType.equals("Windows")) {
			return new WindowsOs();
		} else {
			return new IosOS();
		}
	}
}
