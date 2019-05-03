package com.bob.hms.admin.common.pract2.DP;

public class MessageBuilderRunner {

	public static void main(String[] args) {
		MessageBuilderFactory factory = new MessageBuilderFactory();
		MessageBuilder builder = factory.getMessageBuilder("email");
		builder.build();
	}

}
