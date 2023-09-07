package Opgave3;

public class AgeDiscount implements Discount{

    public double getDiscount(double fødselsår) {
        return (2023 - fødselsår) / 100;
    }
}
