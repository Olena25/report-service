package com.epam.report;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class ReportEmailService implements EmailService{
    @Value("${emails}")
    private String [] emails;
    @Value("${directorEmail}")
    private String directorEmail;
    @Override
    public void sendToAll(Report report) {
        for (String email : emails) {
            if (email.contains("@")) {
                System.out.println("Sending report " + report + " " + email);
            }else {
                System.out.println(email + " email is not correct");
            }
        }
    }
    @PostConstruct
    public void init(){
        System.out.println("Report application is starting, sending email to director " + directorEmail);
    }
  @PreDestroy
  public void destroy(){
      System.out.println("Report application is stopped, sending email to director " + directorEmail);
  }
    @Override
    public void sendToDirector(Report report) {
        System.out.println("Sending report " + report + " for director with email " + directorEmail);
    }
}
