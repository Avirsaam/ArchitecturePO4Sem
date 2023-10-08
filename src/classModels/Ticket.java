package classModels;

import java.util.Date;

/*
  Класс реализующий билет
 */

public class Ticket {
    public int rootNumber;
    public int place;
    public int price;
    public Date date;

    public boolean isValid;

    public Ticket(int rootNumber, int place, int price, Date date, boolean isValid) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", place=" + place +
                ", price=" + price +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }

    public int getRootNumber() {
        return rootNumber;
    }

    public int getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }
}
