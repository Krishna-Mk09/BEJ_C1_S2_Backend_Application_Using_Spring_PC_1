package com.niit.jdp;

import domain.Product;
import domain.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        Product product1 = (Product) context.getBean("product1");
        System.out.println(product1);

    }
}
