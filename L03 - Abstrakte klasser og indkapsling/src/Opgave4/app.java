package Opgave4;

public class app {
    public static void main(String[] args) {
        Kvadrat k1 = new Kvadrat(4);
        System.out.println("Areal for kvadrat: " + k1.udregnAreal());

        Rektangel r1 = new Rektangel(3, 5);
        System.out.println("Areal for rektangel " + r1.udregnAreal());

        Cirkel c1 = new Cirkel(7);
        System.out.println("Areal for: cirkel " + c1.udregnAreal());

        Ellipse e1 = new Ellipse(4, 8);
        System.out.println("Areal for ellipse: " + e1.udregnAreal());


    }
}
