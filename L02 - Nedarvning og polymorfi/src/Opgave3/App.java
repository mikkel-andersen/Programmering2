package Opgave3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        //Products
        Product p1 = new Product(1, "CheeseBurger", 10);
        Product p2 = new Product(2, "Pizza", 50);
        Product p3 = new Product(3, "Pomfritter", 20);
        Product p4 = new Product(4, "Mozzarella sticks", 40);
        Product p5 = new Product(5, "RibEye Steak", 200);

        //Orders
        Order O1 = new Order(1);
        Order O2 = new Order(2);
        Order O3 = new Order(3);
        Order O4 = new Order(4);
        Order O5 = new Order(5);
        Order O6 = new Order(6);

        //OrderLines
        OrderLine line1 = new OrderLine(1, 3, p1);
        OrderLine line2 = new OrderLine(2, 2, p2);
        OrderLine line3 = new OrderLine(3, 6, p3);
        OrderLine line4 = new OrderLine(4, 7, p2);
        OrderLine line5 = new OrderLine(5, 1, p1);
        OrderLine line6 = new OrderLine(6, 2, p5);
        OrderLine line7 = new OrderLine(7, 3, p4);
        OrderLine line8 = new OrderLine(8, 4, p1);
        OrderLine line9 = new OrderLine(9, 5, p2);
        OrderLine line10 = new OrderLine(10, 1, p4);

        O1.createOrderLine(2, p1);
        O3.createOrderLine(3, p5);


        System.out.println(O1.getOrderPrice(O1));



        //Customers
        Customer C1 = new Customer("Mathias", 1999);
        C1.addOrder(O1);
        C1.addOrder(O2);

        Customer C2 = new Customer("Asger", 2018);
        C2.addOrder(O3);
        C2.addOrder(O4);
        C2.addOrder(O5);
        C2.addOrder(O6);

        //Discounts
        Discount d1 = new AgeDiscount(C1.getBirthyear());

        C1.setDiscount(d1);



        System.out.println(line2.getOrderLinePrice(line2));
        System.out.println(d1.getDiscount(C1.totalBuy()));
        System.out.println(C2.totalBuy());




    }
}
