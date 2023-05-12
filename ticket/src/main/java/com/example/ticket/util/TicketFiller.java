package com.example.ticket.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.ticket.model.Ticket;
import com.example.ticket.service.TicketService;

@Component
public class TicketFiller {
    private final TicketService ticketService;
    
    public TicketFiller(TicketService ticketService){
        this.ticketService = ticketService;
    }
    
    @PostConstruct
    public void init()
    {
        Ticket ticket1 = new Ticket("Create a report with 4 columns", "Create a new report", "Entered");
        ticketService.insert(ticket1);

        Ticket ticket2 = new Ticket("Create a new field called tax", "New field", "Development");
        ticketService.insert(ticket2);
        
        Ticket ticket3 = new Ticket("Create a new checkbox which allow to use intercompanies", "Allow to use intercompanies", "Offer");
        ticketService.insert(ticket3);
        
        Ticket ticket4 = new Ticket("Create a sum of 2 numbers", "Sum of records", "Quality Managment");
        ticketService.insert(ticket4);
        
    }
}
