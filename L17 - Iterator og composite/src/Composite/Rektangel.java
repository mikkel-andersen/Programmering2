package Composite;

public class Rektangel implements Figur {
    private String navn;
    private double højde;
    private  double længde;

    public Rektangel(String navn, double højde, double længde) {
        this.navn = navn;
        this.højde = højde;
        this.længde = længde;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public double getAreal() {
        return højde * længde;
    }

    @Override
    public void tegn() {
        System.out.println("Rektangel: " + navn);
    }
}
