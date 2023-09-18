import java.time.LocalDate;

public class Bibliotek {

    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     * beregnetDato < faktiskDato
     * (beregnetDato er forventet afleveringsdato og
     * faktiskDato er den dag bogen blev afleveret; voksen er
     * sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        int bøde = 0;
        int dage = (int) (faktiskDato.toEpochDay() - beregnetDato.toEpochDay());
        if (dage < 1) {
            return bøde;
        }
        if (voksen) {
            bøde = 20;
        } else {
            bøde = 10;
        }

        if (faktiskDato.isAfter(beregnetDato)) {
            int days = (int) (faktiskDato.toEpochDay() - beregnetDato.toEpochDay());
            if (days > 7 && days <= 14) {
                if (voksen) {
                    bøde = 60;
                } else {
                    bøde = 30;
                }
            } else if (days > 14) {
                if (voksen) {
                    bøde = 90;
                } else {
                    bøde = 45;
                }
            }
        }
        return bøde;
    }
}
