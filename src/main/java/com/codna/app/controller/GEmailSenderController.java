package com.codna.app.controller;

import com.codna.app.model.GEmailSender;
import com.codna.app.service.GEmailSenderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GEmailSenderController {

    GEmailSenderService gEmailSenderService;

    public GEmailSenderController(GEmailSenderService gEmailSenderService) {
        this.gEmailSenderService = gEmailSenderService;
    }

    @GetMapping("/")
    public String emailForm(){
        return "GEmailSenderForm";
    }

    @PostMapping("/sendmail")
    @ResponseBody
    public String sendMail(@ModelAttribute GEmailSender emailSender){
        gEmailSenderService.sendMail(emailSender);
        return "sent";
    }
}
