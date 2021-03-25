package com.king.beans;

public class MessageWriter {

	IMessageFormatter formatter;

	public MessageWriter() {
		System.out.println("MessageWriter constructor callled");
	}
	
	public void setFormatter(IMessageFormatter formatter) {
		this.formatter = formatter;
	}
	
	public void formatMessage(String message) {
		String formattedMessage = formatter.format(message);
		System.out.println(formattedMessage);
	}
}
