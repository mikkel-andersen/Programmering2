package Opgave3;

public class PercentDiscount extends Discount {

    private double discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public double getDiscount(double price) {
        return price * (discountPercentage / 100);
    }


}
