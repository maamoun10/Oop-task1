package myapp;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
   private List<Customer>customerList;
    public CustomerManager() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer){customerList.add(customer);}
    public void removeCustomer(int customerId){customerList.removeIf(customer ->customerId== customer.getId());}
    public void viewAllCustomers(){for(Customer customer:customerList) {System.out.println(customer);};}
    public List<Customer> getCustomerList() {return customerList;}
}




