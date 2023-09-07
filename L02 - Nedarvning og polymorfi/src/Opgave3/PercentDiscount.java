package Opgave3;

public class PercentDiscount implements Discount {

    private double discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public double getDiscount(double price) {
        return price * (discountPercentage / 100);
    }


}
