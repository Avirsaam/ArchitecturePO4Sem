package classModels;

import Interfaces.ICustomer;
import Providers.CashProvider;
import Providers.TicketProvider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer implements ICustomer {
    public int id;
    public CashProvider cashProvider;
    public TicketProvider ticketProvider;
    public List<Ticket> tictets;

    public Customer(int id, long cardNumber){
        this.id = id;
        cashProvider = new CashProvider(cardNumber);
        ticketProvider = new TicketProvider();
        tictets = new ArrayList<>();
    }

    @Override
    public boolean buyTicket(Ticket ticket) {
        cashProvider.authorization(this);
        cashProvider.buy(ticket.price);
        ticketProvider.addTicket(ticket);
        return true;
    }

    @Override
    public List<Ticket> searchTicket(int rootNumber) {
        System.out.println("Поиск билетов по номеру " + rootNumber);
        System.out.println(ticketProvider.getTicket(rootNumber));
        return ticketProvider.getTicket(rootNumber);
    }
}
