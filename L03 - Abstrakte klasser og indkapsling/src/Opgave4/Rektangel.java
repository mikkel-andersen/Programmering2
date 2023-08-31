package Opgave4;

public class Rektangel extends Kvadrat{

    private int s1;
    public Rektangel(int s1, int sideLængde) {
        super(sideLængde);
        this.s1 = s1;
    }

    @Override
    public double udregnAreal() {
        return s1 * super.getSideLængde();
    }
}
