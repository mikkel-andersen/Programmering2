package PolyformiOpgave1;

import java.util.Date;

public class Værkfører extends Mekaniker{
    private double tillægPrUge;
    private int udnævnelseÅr;

    public Værkfører(String navn, String adresse, int årForSvendeprøve, double timeLønssats, double tillægPrUge, int udnævnelseÅr) {
        super(navn, adresse, årForSvendeprøve, timeLønssats);
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
        return super.beregnLoen() + (tillægPrUge);
    }
}
