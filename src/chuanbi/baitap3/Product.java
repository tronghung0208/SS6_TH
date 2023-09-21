package chuanbi.baitap3;

public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;
    public Product(int productId, String productName, float productPrice, Category category) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }
    public Product() {
        super();
    }
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
                + ", category=" + category + "]";
    }


}
