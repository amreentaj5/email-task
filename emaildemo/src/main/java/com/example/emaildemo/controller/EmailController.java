package com.example.emaildemo.controller;

import com.example.emaildemo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
//Auto wired
    @Autowired
    private EmailService emailService;

    // Endpoint to trigger sending email.
    @GetMapping("/send-email")
    public String sendEmail(
            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String body) {

        emailService.sendEmail(to, subject, body);
        return "Email sent successfully!";
    }
}
