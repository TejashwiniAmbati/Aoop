package com.example.dip;

public class EmailService {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        MyApplication app = new MyApplication(emailService);
        app.processMessage("Hello", "alice@example.com");

        SMSService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hi", "1234567890");
    }

	public void processMessage(String message, String receiver) {
		// TODO Auto-generated method stub
		
	}
}
