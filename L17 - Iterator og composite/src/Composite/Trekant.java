package Composite;

public class Trekant implements Figur {
    private String navn;
    private double højde;
    private double grundlinje;

    public Trekant(String navn, double højde, double grundlinje) {
        this.navn = navn;
        this.højde = højde;
        this.grundlinje = grundlinje;


    }
    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public double getAreal() {
        return 0.5 * højde * grundlinje;
    }

    @Override
    public void tegn() {
        System.out.println("Trekant: " + navn);

    }
}
