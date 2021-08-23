package com.example.demo.behaviour.Interator;

public interface PatternAggregate {
    void addPattern(DesignPattern designPattern);
    void removePattern(DesignPattern designPattern);
    PatternIterator getPatternIterator();
}
