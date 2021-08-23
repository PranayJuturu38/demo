package com.example.demo.structural.Bridge;

public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }
     abstract public void send();
}