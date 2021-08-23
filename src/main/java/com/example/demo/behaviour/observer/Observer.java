package com.example.demo.behaviour.observer;

import java.math.BigDecimal;
public interface Observer {
    public void update(Observer observer,String productName, BigDecimal bidAmount);
  }
