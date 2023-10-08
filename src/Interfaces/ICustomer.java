package Interfaces;

import classModels.Ticket;

import java.util.Date;
import java.util.List;

public interface ICustomer {
    public boolean buyTicket(Ticket ticket);

    public List<Ticket> searchTicket(int rootNumber);
}
