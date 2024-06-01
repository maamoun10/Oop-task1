package myapp;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    public  List <Order>orderList;

    public OrderManager() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order Order){orderList.add(Order);}
    public void viewAllOrders(){for(Order order:orderList){System.out.println(order);;}

    }




}
