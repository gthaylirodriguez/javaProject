package com.example.ticket.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Ticket {
    private String ticketId;
    private String description;
    private String subject;
    private String status;

    public Ticket(String description, String subject, String status) {
        this.description = description;
        this.subject = subject;
        this.status = status;
    }
}
