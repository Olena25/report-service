package com.epam.report;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        ReportService reportServicelmpl = context.getBean("reportServicelmpl",ReportService.class);
        reportServicelmpl.startReporting();
    }
}
