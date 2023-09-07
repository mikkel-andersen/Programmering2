package Opgave3;

public class FixedDiscount implements Discount {

    private int discountLimit;
    private int fixedDiscount;

    public FixedDiscount(int discountLimit, int fixedDiscount) {
        this.discountLimit = discountLimit;
        this.fixedDiscount = fixedDiscount;
    }
    @Override
    public double getDiscount(double price) {
        if (price >= discountLimit) {
            return price - fixedDiscount;
        } else {
            return price;
        }
    }
}
