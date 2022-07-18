package com.epam.report;

public interface EmailService {

    void sendToAll(Report report);
    void sendToDirector(Report report);
}
