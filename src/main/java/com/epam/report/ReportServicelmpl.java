package com.epam.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReportServicelmpl implements ReportService {

    @Value("${shouldSendToDirectorOnly}")
    private boolean shouldSendToDirector;

    private EmailService emailService;


    @Autowired
    public ReportServicelmpl(@Qualifier("reportEmailService") EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void startReporting() {
        Report report = new Report(LocalDate.now(),"Report text");
        if (LocalDate.now().getDayOfMonth() !=30){
            System.out.println("Day of month is not 30");
         return;
        }
        if (shouldSendToDirector){
            emailService.sendToDirector(report);
        } else  {
            emailService.sendToAll(report);
        }


    }
}