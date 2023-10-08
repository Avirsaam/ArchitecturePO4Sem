package Providers;

import Repositories.CashRepository;
import classModels.Customer;

public class CashProvider {
    /*
    Класс для взаимодействия с базой банковских операций
     */

    CashRepository cashRepository;

    private boolean isAuthorized = false;
    private long numberCard;

    long sellersCard = 123456789;



    public CashProvider(long numberCard){
        cashRepository = new CashRepository();
        this.numberCard = numberCard;
    }

    public boolean authorization(Customer customer){
        if (customer.id > 0){
            System.out.println("Пользователь успешно авторизован");
            isAuthorized = true;
            return true;
        }
        System.out.println("Авторизация не прошла");
        return false;
    }

    public void buy(int price){
        if (isAuthorized){
            System.out.println("Покупка билета");
            cashRepository.bankTransaction(price, numberCard, sellersCard);
        } else {
            System.out.println("Невозможно купить билет так как авторизация не прошла");
        }

    }



}
