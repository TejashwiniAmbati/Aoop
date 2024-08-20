package com.example.dip;

public class MyApplication {
    private EmailService messageService;

    public MyApplication(EmailService smsService) {
        this.messageService = smsService;
    }

    public void processMessage(String message, String receiver) {
        this.messageService.processMessage(message, receiver);
    }
}
