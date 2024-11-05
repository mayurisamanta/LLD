package service.discount;

public class FixedAmountDiscount implements DiscountStrategy {

    private double discountAmount;

    public FixedAmountDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        if (totalPrice < discountAmount) {
            throw new IllegalArgumentException("Discount amount is greater than total price");
        }
        return totalPrice - discountAmount;
    }
}
