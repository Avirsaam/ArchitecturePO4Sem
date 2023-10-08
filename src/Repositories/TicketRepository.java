package Repositories;

import Interfaces.ITicketRepository;
import classModels.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository implements ITicketRepository {
    /*
    Класс симуляция работы с базой данных билетов
     */

    private List<Ticket> tickets;

    public TicketRepository(){
        tickets = new ArrayList<>();
        tickets.add(new Ticket(1, 11, 111,null , true));
        tickets.add(new Ticket(2, 22, 222 ,null , true));
        tickets.add(new Ticket(3, 33, 333 ,null , true));
    }

    @Override
    public boolean createTicket(Ticket ticket) {
        System.out.println("В репозиторий добавлен новый билет");
        System.out.println(ticket);
        tickets.add(ticket);
        return true;
    }

    @Override
    public List<Ticket> getTicket(int rootNumber) {
        List<Ticket> result = new ArrayList<>();
        for (Ticket t : tickets){
            if (t.rootNumber == rootNumber)
                result.add(t);
        }
        return result;
    }

    @Override
    public boolean updateTicket(Ticket ticket) {
        for (int i = 0; i < tickets.size() ; i++) {
            if (tickets.get(i).rootNumber == ticket.rootNumber){
                System.out.println("Билет с номером " + ticket.rootNumber + " обновлён");
                tickets.remove(i);
                tickets.add(ticket);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteTicket(Ticket ticket) {
        if (tickets.contains(ticket)) {
            tickets.remove(ticket);
            return true;
        }
        return false;
    }

}
