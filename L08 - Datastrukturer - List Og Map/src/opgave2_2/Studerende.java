package opgave2_2;

import java.util.HashSet;
import java.util.List;

public class Studerende {

    private String navn;
    private int studieNr;
    private HashSet<Integer> karakterer;


    public Studerende(String navn, int studieNr, HashSet karakterer) {
        this.navn = navn;
        this.studieNr = studieNr;
        this.karakterer = karakterer;
    }


    public String getNavn() {
        return navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public HashSet getKarakterer() {
        return karakterer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public void setKarakterer(HashSet karakterer) {
        this.karakterer = karakterer;
    }

    public String toString() {
        return navn + " " + studieNr + " " + karakterer;
    }

    public double gennemsnit() {
        double sum = 0;
        for (Integer i : karakterer) {
            sum += i.doubleValue();
        }
        return sum / karakterer.size();
    }


}
