package com.codna.app.model;

import lombok.Data;

@Data
public class GEmailSender {

    private String to;
    private String subject;
    private String message;
}
