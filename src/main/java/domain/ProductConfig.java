/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package domain;

import org.springframework.context.annotation.Bean;

public class ProductConfig {

    /**
     * The function getProductBean1() returns a Product object with the following properties: id = 1, name = "macbook air",
     * price = 120000, description = "apple product", and review = "excellent"
     *
     * @return A bean of type Product with the name product1
     */
    @Bean("product1")
    public Product getProductBean1() {
        return new Product(1, "macbook air", 120000, "apple product", "excellent");
    }

    /**
     * The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered
     * as a bean in the Spring application context
     *
     * @return A bean of type Product with the name product2
     */
    @Bean("product2")
    public Product getProductBean2() {
        return new Product(2, "rolex", 300000, "rolex product", "excellent");
    }

    /**
     * The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered
     * as a bean in the Spring application context
     *
     * @return A bean of type Product with the name product3
     */
    @Bean("product3")
    public Product getProductBean3() {
        return new Product(3, "nike ", 12000, "nike product", "good");
    }
}
