package main;

import entity.Order;
import entity.Product;
import service.discount.PercentageDiscount;
import service.notification.EmailNotification;
import service.notification.Notification;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", 1000, "Electronics"),
                new Product("Mobile", 500, "Electronics"),
                new Product("Shirt", 50, "Clothing")
        );

        Order order = new Order(products);
        order.setDiscountStrategy(new PercentageDiscount(10));

        double orderAmount = order.calculateTotalPrice();

        System.out.println("Total price after discount: " + orderAmount);

        Notification notification = new EmailNotification();
        notification.sendNotification();

    }
}
