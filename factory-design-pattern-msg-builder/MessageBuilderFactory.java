package com.bob.hms.admin.common.pract2.DP;

public class MessageBuilderFactory {
	
	public MessageBuilder getMessageBuilder(String type) {
		MessageBuilder builder = null;
		if (type.equals("sms")) {
			builder = new SMSBuilder();
		} else if (type.equals("email")) {
			builder = new EmailBuilder();
		} else {
			builder = new NotificatioBuilder();
		}
		return builder;
	}
}
