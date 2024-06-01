package myapp;

import java.util.List;

public class Order {
    private int id;
    Customer customer;
    List<Product>productList;
    private int totalAmount=0;

    public Order(int id, Customer customer, List<Product> productList) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        this.totalAmount = totalAmount;
    }

    private double calculateTotalAmount(){
        for (Product product:productList)
            totalAmount+=product.getPrice();
        return totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", productList=" + productList +
                ", totalAmount=" + totalAmount +
                '}';
    }

}
