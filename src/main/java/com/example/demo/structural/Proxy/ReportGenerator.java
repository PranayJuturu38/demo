package com.example.demo.structural.Proxy;

public interface ReportGenerator {
    void displayReportTemplate(String reportFormat,int reportEntries);
    void generateComplexReport(String reportFormat,int reportEntries);
    void generateSensitiveReport();
}
