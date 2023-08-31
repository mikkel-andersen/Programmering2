package Opgave3;

public class Arbejderdreng extends Ansat{

    public Arbejderdreng(String navn, String adresse, double timeLønssats) {
        super(navn, adresse, timeLønssats);
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen() * 25;
    }
}
