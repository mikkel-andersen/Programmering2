package Opgave4;

public class Cirkel extends Figur {
    private int radius;

    public Cirkel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double udregnAreal() {
        return (radius * radius) * Math.PI;
    }
}
