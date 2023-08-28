package PolyformiOpgave1;

import java.util.Date;

public class Mekaniker extends Person {
    private int årForSvendeprøve;
    private double timeLønssats;

    public Mekaniker(String navn, String adresse, int årForSvendeprøve, double timeLønssats) {
        super(navn, adresse);
        this.årForSvendeprøve = årForSvendeprøve;
        this.timeLønssats = timeLønssats;
    }

    public int getÅrForSvendeprøve() {
        return årForSvendeprøve;
    }

    public int setÅrForSvendeprøve(int årForSvendeprøve) {
        return this.årForSvendeprøve = årForSvendeprøve;
    }

    public double getTimeLønssats() {
        return timeLønssats;
    }

    public void setTimeLønssats(double timeLønssats) {
       this.timeLønssats = timeLønssats;
    }

    public double beregnLoen() {
        return (timeLønssats * 37);
    }
}
