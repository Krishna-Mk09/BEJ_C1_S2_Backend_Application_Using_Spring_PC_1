/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package domain;

import org.springframework.context.annotation.Bean;

public class ProductConfig {

    @Bean("product1")
    public Product getProductBean1() {
        return new Product(1, "macbook air", 120000, "apple product", "excellent");
    }
    @Bean("product2")
    public Product getProductBean2() {
        return new Product(2, "rolex", 300000, "rolex product", "excellent");
    }
    @Bean("product3")
    public Product getProductBean3() {
        return new Product(3, "nike ", 12000, "nike product", "good");
    }
}
