/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package domain;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private String description;
    private String productRating;

    public Product() {
    }

    public Product(int productId, String productName, double productPrice, String description, String productRating) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.productRating = productRating;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductRating() {
        return productRating;
    }

    public void setProductRating(String productRating) {
        this.productRating = productRating;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName='" + productName + '\'' + ", productPrice=" + productPrice + ", description='" + description + '\'' + ", productRating='" + productRating + '\'' + '}';
    }
}
