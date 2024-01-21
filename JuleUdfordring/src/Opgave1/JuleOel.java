package Opgave1;

public class JuleOel {

    public static int amountOfBeers(int kroner) {
        int prisPrØl = 7;
        int amount = kroner / prisPrØl;
        if ((amount + (kroner % 7)) < prisPrØl) {
            return amount;
        } else {
            amount = amount + amountOfBeers(amount);
        }
        System.out.println(amount);
        return amount + 1;
    }

    public static void main(String[] args) {
       // amountOfBeers(1202);
      //  amountOfBeers(650);
        amountOfBeers(8000);
    }


}
