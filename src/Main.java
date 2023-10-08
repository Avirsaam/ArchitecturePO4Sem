import classModels.Customer;
import classModels.Ticket;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(10, 987654321);
        Ticket ticket1 = new Ticket(5, 55, 555, null, true);
        Ticket ticket2 = new Ticket(5, 66, 666, null, true);

        customer.buyTicket(ticket1);
        customer.buyTicket(ticket2);
        customer.searchTicket(5);

    }
}