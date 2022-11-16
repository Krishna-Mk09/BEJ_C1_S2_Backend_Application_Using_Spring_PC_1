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
}
