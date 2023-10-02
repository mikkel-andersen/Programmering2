package opgave2;

import java.util.List;

public class Studerende {

    private String navn;
    private int studieNr;
    private List<Integer> karakterer;


    public Studerende(String navn, int studieNr, List karakterer) {
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

    public List getKarakterer() {
        return karakterer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public void setKarakterer(List karakterer) {
        this.karakterer = karakterer;
    }

    public String toString() {
        return navn + " " + studieNr + " " + karakterer;
    }

    public double gennemsnit() {
        double sum = 0;
        for (int i = 0; i < karakterer.size(); i++) {
            sum += (int) karakterer.get(i);
        }
        return sum / karakterer.size();
    }


}
