package Interfaces;

import classModels.Ticket;

import java.util.List;

public interface ITicketRepository {
    /*
        Интерфейс для связи с базой данных билетов
     */

    /**
     * Создать новый билет
     */
    boolean createTicket(Ticket ticket);

    /**
     * Получить список билетов
     */
    List<Ticket> getTicket(int rootNumber);

    /**
     * Обновить данные по билету в базе
     */
    boolean updateTicket(Ticket ticket);

    /**
     * удалить билет из базы
     */
    boolean deleteTicket(Ticket ticket);

}
