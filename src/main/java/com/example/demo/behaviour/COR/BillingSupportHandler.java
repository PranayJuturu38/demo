package com.example.demo.behaviour.COR;

public class BillingSupportHandler extends AbstractSupportHandler {
    public BillingSupportHandler(int level){
        this.level = level;
    }
        @Override
        protected void handleRequest (String message){
        System.out.println("BillingSupportHandler: Processing request. " + message);
    }
}
