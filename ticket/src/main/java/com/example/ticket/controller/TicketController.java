package com.example.ticket.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticket.model.Ticket;
import com.example.ticket.service.TicketService;

@RestController
@RequestMapping({"ticket"})
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("")
    public List<Ticket> getAll(){
        return ticketService.getAll();
    }
    @GetMapping("/{ticketId}")
    public Ticket get(@PathVariable String ticketId){
        return ticketService.get(ticketId);
    }

    @PostMapping("")
    public Ticket insertTicket(@RequestBody Ticket ticket){
        return ticketService.insert(ticket);
    }

    @PutMapping("/{ticketId}")
    public Ticket updateTicket(@PathVariable String ticketId,  @RequestBody Ticket ticket){
        return ticketService.update(ticketId, ticket);
    }

    @DeleteMapping("/{ticketId}")
    public Ticket deleteTicket(@PathVariable String ticketId){
        return ticketService.deleteTicket(ticketId);
    }
}
