package PolyformiOpgave1;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Værkfører> liste1 = new ArrayList<>();

        Værkfører v1 = new Værkfører("Værkfører 1", "Værkfører 1 adresse", 2009, 150, 250, 2010);
        Værkfører v2 = new Værkfører("Værkfører 2", "Værkfører 2 adresse", 2005, 245, 500, 2008);

        liste1.add(v1);
        liste1.add(v2);

        ArrayList<Mekaniker> liste2 = new ArrayList<>();

        Mekaniker m1 = new Mekaniker("Mekaniker 1", "Mekaniker 1 adresse", 2009, 150);
        Mekaniker m2 = new Mekaniker("Mekaniker 2", "Mekaniker 2 adresse", 2010, 205);
        Mekaniker m3 = new Mekaniker("Mekaniker 3", "Mekaniker 3 adresse", 2005, 175);

        liste2.add(m1);
        liste2.add(m2);
        liste2.add(m3);

        ArrayList<Synsmand> liste3 = new ArrayList<>();

        Synsmand s1 = new Synsmand("Synsmand 1", "Synsmand 1 adresse", 2009, 150, 17);
        Synsmand s2 = new Synsmand("Synsmand 2", "Synsmand 2 adresse", 2010, 205, 12);
        Synsmand s3 = new Synsmand("Synsmand 3", "Synsmand 3 adresse", 2005, 175, 10);

        liste3.add(s1);
        liste3.add(s2);
        liste3.add(s3);

        System.out.println("Samlet løn for værkførere: " + samletLoen2(liste1));

        System.out.println("Samlet løn for mekanikere: " + samletLoen(liste2));

        System.out.println("Samlet løn for synsmænd: " + samletLoen3(liste3));



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


}
