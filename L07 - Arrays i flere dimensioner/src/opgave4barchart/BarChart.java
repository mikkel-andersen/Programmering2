package opgave4barchart;

import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> readValues() {
        System.out.println("Indtast nogle positive tal.  " + "Indtast et negativt tal for at afslutte: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n >= 0) {
            list.add(n);
            n = in.nextInt();
        }
        return list;
    }

    /**
     * Finds and returns the max value in the list.
     *
     * @param list
     *            the list with values.
     * @return the max value found.
     */
    public int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    /**
     * Prints out a BarChart of the values using the System.out.println method.
     */
    public void printBarChart() {
        int max = findMax(this.list);
        // TODO: print out bar chart
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int stars = (int) (value * 40.0 / max);
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
