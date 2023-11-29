package Composite;

import java.util.ArrayList;
import java.util.List;

public class SammensatFigur implements Figur {
    private List<Figur> figurer = new ArrayList<>();
    private String navn;

    public SammensatFigur(String navn) {
        this.navn = navn;
    }

    public void tilføjFigur(Figur figur) {
        figurer.add(figur);
    }
    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public double getAreal() {
        double samletAreal = 0.0;
        for (Figur figur : figurer) {
            samletAreal += figur.getAreal();
        }
        return samletAreal;
    }

    @Override
    public void tegn() {
        System.out.println("Sammensat figur: " + navn);
        for (Figur figur : figurer) {
            figur.tegn();
        }
    }


}
