package opgave2_2;

import java.util.HashSet;
import java.util.List;

public class Skole {

    private String navn;
    private HashSet<Studerende> studerende;

    public Skole (String navn, HashSet<Studerende> studerende) {
        this.navn = navn;
        this.studerende = studerende;

    }

    public String getNavn() {
        return navn;
    }

    public String toString() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        this.studerende.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        this.studerende.remove(studerende);
    }

    public HashSet<Studerende> getStuderende() {
        return studerende;
    }

    public Studerende findStuderende(int studieNr) {
        Studerende student = null;
        for (Studerende s : studerende) {
            if (s.getStudieNr() == studieNr) {
                student = s;
            }
        }
        return student;
    }

    public double gennemsnit() {
        double sum = 0;
        for (Studerende s : studerende) {
            sum += s.gennemsnit();
        }
        return sum / studerende.size();
    }


}
