package Opgave3;

public class Værkfører extends Ansat{
    private double tillægPrUge;
    private int udnævnelseÅr;

    public Værkfører(String navn, String adresse, double timeLønssats, double tillægPrUge, int udnævnelseÅr) {
        super(navn, adresse, timeLønssats);
        this.tillægPrUge = tillægPrUge;
        this.udnævnelseÅr = udnævnelseÅr;
    }

    public double getTillægPrUge() {
        return super.getTimeLønssats() + tillægPrUge;
    }

    public void setTillægPrUge(int tillægPrUge) {
        this.tillægPrUge = tillægPrUge;
    }

    public double getUdnævnelseÅr() {
        return udnævnelseÅr;
    }

    public void setUdnævnelseÅr(int udnævnelseÅr) {
        this.udnævnelseÅr = udnævnelseÅr;
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen() * 37 + (tillægPrUge);
    }
}
