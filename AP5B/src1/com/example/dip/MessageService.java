package com.example.dip;

public class MessageService {
    private MessageService messageService;

    public void MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        this.messageService.processMessage(message, receiver);
    }
}