package myapp;

public class Product {


    private  int id;
    private  String name, description;
    private double price;
    private   int stockQuantity;

    public Product(int id, String name, String description, double price,int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity=stockQuantity;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public  int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", price=" + price + ", stockQuantity=" + stockQuantity + '}';
    }
}
