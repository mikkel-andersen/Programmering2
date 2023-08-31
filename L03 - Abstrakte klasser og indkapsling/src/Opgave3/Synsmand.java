package Opgave3;

public class Synsmand extends Mekaniker{

    private int antalSynDenneUge;

    public Synsmand(String navn, String adresse, int årForSvendeprøve, double timeLønssats, int antalSynDenneUge) {
        super(navn, adresse, årForSvendeprøve, timeLønssats);
        this.antalSynDenneUge = antalSynDenneUge;
    }

    public int getAntalSynDenneUge() {
        return antalSynDenneUge;
    }

    public void setAntalSynDenneUge(int antalSynDenneUge) {
        this.antalSynDenneUge = antalSynDenneUge;
    }

    public void synBil() {
        antalSynDenneUge++;
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen();
    }
}
