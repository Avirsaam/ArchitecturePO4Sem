package Providers;

import Repositories.TicketRepository;
import classModels.Ticket;

import java.util.List;

public class TicketProvider {
    private TicketRepository ticketRepository;
    public TicketProvider(){
        ticketRepository = new TicketRepository();
    }

    public List<Ticket> getTicket(int rootNumber){
        return ticketRepository.getTicket(rootNumber);
    }

    public boolean addTicket(Ticket ticket){
        return ticketRepository.createTicket(ticket);
    }

    public boolean updateTicket(Ticket ticket){
        return ticketRepository.updateTicket(ticket);
    }
}
