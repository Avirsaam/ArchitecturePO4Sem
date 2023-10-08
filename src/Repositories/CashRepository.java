package Repositories;

import Interfaces.ICashRepository;

public class CashRepository implements ICashRepository {
    /*
    Симуляция работы с базой данных банковских операций
     */
    int totalAmount;
    public CashRepository(){
        totalAmount = 0;
    }
    @Override
    public boolean bankTransaction(int amount, long cardFrom, long cardTo) {
        System.out.println("Проведена транзакция на сумму " + amount + "c карты " + cardFrom + " на карту " + cardTo);
        totalAmount += amount;
        return true;
    }

    public int getTotal(){
        return totalAmount;
    }
}
