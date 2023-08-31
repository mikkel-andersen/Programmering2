package Opgave4;

public class Kvadrat extends Figur{
    private int sideLængde;
    public Kvadrat(int sideLængde) {
        this.sideLængde = sideLængde;
    }

    public int getSideLængde() {
        return sideLængde;
    }

    @Override
    public double udregnAreal() {
        return sideLængde * sideLængde;
    }
}
