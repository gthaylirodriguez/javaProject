package com.example.ticket.repository;
import java.util.List;
import com.example.ticket.model.Ticket;

public interface ITicketRepository {
    public List<Ticket> getAll();
    public Ticket get(String ticketId);
    public Ticket save(Ticket ticket);
    public Ticket delete(String ticketId);
}
