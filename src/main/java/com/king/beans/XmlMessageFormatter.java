package com.king.beans;

public class XmlMessageFormatter implements IMessageFormatter {

	public XmlMessageFormatter() {
		System.out.println("XmlMessageFormatter constructor callled");
	}
	
	public String format(String message) {
		String formattedMessage = "<xml>"+message+"</xml>";
		return formattedMessage;
	}

}
