package com.codna.app.service;

import com.codna.app.model.GEmailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class GEmailSenderService {

    JavaMailSender javaMailSender;

    public GEmailSenderService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(GEmailSender gEmailSender){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(gEmailSender.getTo());
        message.setSubject(gEmailSender.getSubject());
        message.setText(gEmailSender.getMessage());

        javaMailSender.send(message);
    }
}
