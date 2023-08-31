package Opgave4;

public class Ellipse extends Cirkel{

    private int radius2;

    public Ellipse(int radius, int radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    @Override
    public double udregnAreal() {
        return radius2 * super.getRadius() * Math.PI;
    }
}
