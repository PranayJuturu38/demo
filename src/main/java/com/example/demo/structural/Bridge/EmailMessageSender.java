package com.example.demo.structural.Bridge;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(){
        System.out.println("EmailMessageSender: Sending email message...");
    }
}