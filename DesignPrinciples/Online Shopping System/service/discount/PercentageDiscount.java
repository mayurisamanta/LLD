package service.discount;

public class PercentageDiscount implements DiscountStrategy {

    private double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - (totalPrice * discountPercentage / 100);
    }
}
