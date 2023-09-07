package Opgave3;

public class AgeDiscount implements Discount{
    private int fødselsår;

    public AgeDiscount(int fødselsår) {
        this.fødselsår = fødselsår;
    }
    public double getDiscount(double price) {
        return price * (2023 - fødselsår) / 100;
    }
}
