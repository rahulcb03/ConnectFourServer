package com.rahul.wordgames.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service

public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendPasswordResetEmail(String toEmail, String resetLink, String username) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rahulcb03@gmail.com");
        message.setTo(toEmail);
        message.setSubject("Password Reset Request");
        message.setText("Username: "+username+"\nTo reset your password, click the link below (expires in 10 minutes):\n" + resetLink);

        mailSender.send(message);
    }
}
