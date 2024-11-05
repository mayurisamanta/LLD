package entity;

import service.discount.DiscountStrategy;
import service.discount.NoDiscount;

import java.util.List;

public class Order {

    private List<Product> products;

    private DiscountStrategy discountStrategy = new NoDiscount();


    public Order(List<Product> products) {
        this.products = products;
    }


    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotalPrice() {
        double total =  products.stream().mapToDouble(Product::getPrice).sum();
        return discountStrategy.applyDiscount(total);
    }

}
