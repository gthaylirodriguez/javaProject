package com.example.ticket.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.ticket.model.Ticket;

@Repository
public class MemoryTicketRepository implements ITicketRepository {

    private Map<String, Ticket> ticketsMap;

    MemoryTicketRepository (){
        ticketsMap = new HashMap<>();
    }

    @Override
    public List<Ticket> getAll() {
        List <Ticket> ticketList = new ArrayList<>();
         ticketList.addAll(ticketsMap.values());
         return ticketList;
        //throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Ticket get(String ticketId) {
        return ticketsMap.get(ticketId);
        //throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Ticket save(Ticket ticket) {
        if (ticket.getTicketId()== null)
        {
            try {
                Thread.sleep(1000);
                ticket.setTicketId(String.valueOf(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return ticketsMap.put(ticket.getTicketId(), ticket);
       // throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Ticket delete(String ticketId) {
        return ticketsMap.remove(ticketId);
        // throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
