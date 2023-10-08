package Interfaces;

public interface ICashRepository {
    /*
    Интерфес работы с базой данных денежных транзакций
     */

    boolean bankTransaction(int amount, long cardFrom, long cardTo);
}
