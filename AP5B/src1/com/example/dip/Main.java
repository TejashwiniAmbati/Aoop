package com.example.dip;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        MyApplication app = new MyApplication(emailService);
        app.processMessage("Hello", "alice@example.com");

        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hi", "1234567890");
    }
}