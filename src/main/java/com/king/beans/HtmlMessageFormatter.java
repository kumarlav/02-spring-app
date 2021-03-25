package com.king.beans;

public class HtmlMessageFormatter implements IMessageFormatter {

	public HtmlMessageFormatter() {
		System.out.println("HtmlMessageFormatter constructor callled");
	}
	
	public String format(String message) {
		String formattedMessage = "<html>" + message + "</html>";
		return formattedMessage;
	}

}
