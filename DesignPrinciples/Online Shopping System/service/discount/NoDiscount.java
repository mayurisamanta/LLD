package service.discount;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}
