package temaQueue;

import java.util.Date;

public class Order {
    private Date date;
    private int quantity;
    private String item;

    public Order(Date date, int quantity, String item){
        this.date = date;
        this.quantity = quantity;
        this.item = item;
    }

    public String toString(){
        return getClass().getName() + "-" + Integer.toHexString(hashCode());
    }
}
