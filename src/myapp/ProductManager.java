package myapp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductManager {
    private List<Product>productList;




    public ProductManager(){this.productList=new ArrayList<>();};
    public void addProduct(Product product){productList.add(product);}
    public  void removeProduct(int productId){productList.removeIf(product -> productId==product.getId());}
    public void viewAllProducts(){for(Product product:productList){System.out.println(product);}


        ;}

    public void updateStock(int productId, int newStock) {
        for (Product product: productList) {
            if (product.getId() == productId) {
                product.setStockQuantity(newStock);
                break;}}}
    public List<Product> getProductList() {return productList;}

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }}
