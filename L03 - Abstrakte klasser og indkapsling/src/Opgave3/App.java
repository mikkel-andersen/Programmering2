package Opgave3;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Ansat> ansatte = new ArrayList<>();
        Arbejderdreng a1 = new Arbejderdreng("Arbejderdreng 1", "Arbejderdreng 1 adresse", 200);
        ansatte.add(a1);

        ArrayList<Værkfører> liste1 = new ArrayList<>();

        Værkfører v1 = new Værkfører("Værkfører 1", "Værkfører 1 adresse", 200, 195,  2010);
        Værkfører v2 = new Værkfører("Værkfører 2", "Værkfører 2 adresse", 150, 245,  2008);
        ansatte.add(v1); ansatte.add(v2);
        liste1.add(v1);
        liste1.add(v2);

        ArrayList<Mekaniker> liste2 = new ArrayList<>();

        Mekaniker m1 = new Mekaniker("Opgave3.Mekaniker 1", "Opgave3.Mekaniker 1 adresse", 2009, 150);
        Mekaniker m2 = new Mekaniker("Opgave3.Mekaniker 2", "Opgave3.Mekaniker 2 adresse", 2010, 205);
        Mekaniker m3 = new Mekaniker("Opgave3.Mekaniker 3", "Opgave3.Mekaniker 3 adresse", 2005, 175);
        ansatte.add(m1); ansatte.add(m2); ansatte.add(m3);
        liste2.add(m1);
        liste2.add(m2);
        liste2.add(m3);

        ArrayList<Synsmand> liste3 = new ArrayList<>();

        //ynsmand s1 = new Synsmand("Opgave3.Synsmand 1", "Opgave3.Synsmand 1 adresse", 2009, 150, 10);
        Synsmand s2 = new Synsmand("Opgave3.Synsmand 2", "Opgave3.Synsmand 2 adresse", 2010, 205, 10);
        //ansatte.add(s1);
        ansatte.add(s2);
        //liste3.add(s1);
        liste3.add(s2);

        System.out.println("Samlet løn for værkførere: " + samletLoen2(liste1));

        System.out.println("Samlet løn for mekanikere: " + samletLoen(liste2));

        System.out.println("Samlet løn for synsmænd: " + samletLoen3(liste3));

        System.out.println("Samlet løn for alle ansatte " + samletLoen4(ansatte));

    }

    public static double samletLoen(ArrayList<Mekaniker> list) {
        double total = 0;
        for (Mekaniker m : list) {
            total += m.beregnLoen();
        }
        return total;
    }

    public static double samletLoen2(ArrayList<Værkfører> list) {
        double total = 0;
        for (Værkfører v : list) {
            total += v.beregnLoen();
        }
        return total;


    }

    public static double samletLoen3(ArrayList<Synsmand> list) {
        double total = 0;
        for (Synsmand s : list) {
            total += s.beregnLoen();
        }
        return total;
    }

    public static double samletLoen4(ArrayList<Ansat> list) {
        double total = 0;
        for (Ansat a : list) {
            total += a.beregnLoen();
        }
        return total;
    }


}
