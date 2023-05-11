package com.example.ticket.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Ticket {
    private String ticketId;
    private String description;
    private String subject;
    private String status;
}
