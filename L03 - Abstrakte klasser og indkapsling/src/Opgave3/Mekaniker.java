package Opgave3;

public class Mekaniker extends Ansat {
    private int årForSvendeprøve;

    public Mekaniker(String navn, String adresse, int årForSvendeprøve, double timeLønssats) {
        super(navn, adresse, timeLønssats);
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public int getÅrForSvendeprøve() {
        return årForSvendeprøve;
    }

    public int setÅrForSvendeprøve(int årForSvendeprøve) {
        return this.årForSvendeprøve = årForSvendeprøve;
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen() * 37;
    }
}
