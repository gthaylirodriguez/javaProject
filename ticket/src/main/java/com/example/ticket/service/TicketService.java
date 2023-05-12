package com.example.ticket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ticket.model.Ticket;
import com.example.ticket.repository.ITicketRepository;

@Service
public class TicketService {
    private final ITicketRepository ticketRepository;

    public TicketService(ITicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    
    public List<Ticket> getAll()
    {
        return ticketRepository.getAll();
    }

    public Ticket get(String ticketId)
    {
        return ticketRepository.get(ticketId);
    }

    public Ticket insert(Ticket ticket)
    {
        ticket.setTicketId(null);
        return ticketRepository.save(ticket);
    }

    public Ticket update(String ticketId, Ticket ticket)
    {
        Ticket ticketR = ticketRepository.get(ticketId);
        if (ticketR == null){
            return null;
        }

        ticket.setTicketId(ticketId);
        return ticketRepository.save(ticket);
    }

    public Ticket deleteTicket(String ticketId)
    {
        return ticketRepository.delete(ticketId);
    }

}
