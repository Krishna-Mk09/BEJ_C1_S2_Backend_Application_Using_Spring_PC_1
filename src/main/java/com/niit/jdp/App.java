package com.niit.jdp;

import domain.Product;
import domain.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    /**
     * The main function creates an ApplicationContext object, which is an interface that represents the Spring IoC
     * container. The ApplicationContext object is created by passing the ProductConfig class to the
     * AnnotationConfigApplicationContext class. The ApplicationContext object is then used to get the Product objects from
     * the Spring IoC container
     */
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        Product product1 = (Product) context.getBean("product1");
        System.out.println(product1);
        Product product2 = (Product) context.getBean("product2");
        System.out.println(product2);
        Product product3 = (Product) context.getBean("product3");
        System.out.println(product3);

    }
}
