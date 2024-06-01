import myapp.*;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void display(){

        System.out.println(
                "1.Add a new product\n" +
                "2.Remove a product\n" +
                "3.View all products\n" +
                "4.Add a new customer\n" +
                "5.Remove a customer\n" +
                "6.View all customers\n" +
                "7.Create a new order\n" +
                "8.View all orders\n" +
                "9.Exit"+
                "Enter your choice " );

    }
    public static void main(String[] args){

        OrderManager orderManager=new OrderManager();
        CustomerManager customerManager=new CustomerManager();
        ProductManager productManager =new ProductManager();
        Scanner sc =new Scanner(System.in);

       while (true){
        display();
        try {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter product id :");
                    int productId = sc.nextInt();
                    System.out.print("Enter product name: ");
                    String productName = sc.next();
                    System.out.print("Enter price : ");
                    double productPrice = sc.nextDouble();
                    System.out.print("Enter description : ");
                    String description = sc.next();
                    System.out.println("Enter stockQuantity");
                    int stockQuantity = sc.nextInt();
                    Product product = new Product(productId, productName, description, productPrice, stockQuantity);
                    productManager.addProduct(product);
                    System.out.println("product added successfully ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter product id");
                    int removedProduct = sc.nextInt();
                    productManager.removeProduct(removedProduct);
                    System.out.println("product removed");
                    System.out.println();
                    break;
                case 3:
                    productManager.viewAllProducts();
                    break;
                case 4:
                    System.out.print("Enter customer id:");
                    int customerId = sc.nextInt();
                    System.out.print("Enter product name: ");
                    String customerName = sc.next();
                    System.out.print("Enter customer email: ");
                    String customerEmail = sc.next();
                    System.out.print("Enter customer address: ");
                    String customerAddress = sc.next();
                    Customer customer = new Customer(customerId, customerName, customerEmail, customerAddress);
                    customerManager.addCustomer(customer);
                    System.out.println("customer added successfully ");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter customer id");
                    int removedCustomer = sc.nextInt();
                    customerManager.removeCustomer(removedCustomer);
                    System.out.println("customer removed");
                    System.out.println();
                    break;
                case 6:
                    customerManager.viewAllCustomers();
                    break;
                case 7:
                    System.out.print("Enter order id: ");
                    int orderId = sc.nextInt();
                    System.out.print("Enter customer id: ");
                    int customerOrderId = sc.nextInt();
                    Customer customerOrderObj = null;
                    for (Customer c : customerManager.getCustomerList()) {

                        if (c.getId() == customerOrderId) {
                            customerOrderObj = c;
                            break;
                        }
                    }
                    if (customerOrderObj == null) {
                        System.out.println("not found");
                        break;
                    }

                    List<Product> productOrder = new ArrayList<>();
                    while (true) {
                        System.out.print("Enter product id ");
                        int orderProductId = sc.nextInt();
                        Product orderProductObj = null;
                        if (orderProductId == 0) break;
                        for (Product p : productManager.getProductList()) {
                            if (p.getId() == orderProductId) {
                                orderProductObj = p;
                                break;
                            }
                        }
                        if (orderProductObj == null) {
                            System.out.println(" not found");
                            continue;
                        }
                        productOrder.add(orderProductObj);
                    }

                    Order order = new Order(orderId, customerOrderObj, productOrder);
                    orderManager.addOrder(order);
                    break;
                case 8:
                    orderManager.viewAllOrders();
                    break;
                case 9:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid choice ");
            }

        }catch (InputMismatchException e ){
               System.out.println("Invalid input. Please choose another choice from 0 to 9 as numbers.");
               break;
           }
}}}