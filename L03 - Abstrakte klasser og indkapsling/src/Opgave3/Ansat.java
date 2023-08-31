package Opgave3;

public class Ansat extends Person{
    private double timeLønssats;
    public Ansat(String navn, String adresse, double timeLønssats) {
        super(navn, adresse);
        this.timeLønssats = timeLønssats;
    }

    public double getTimeLønssats() {
        return timeLønssats;
    }

    public void setTimeLønssats(double timeLønssats) {
        this.timeLønssats = timeLønssats;
    }

    public double beregnLoen() {
        return timeLønssats;
    }

}
