package CustomerOpgaver;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        customers[0] = new Customer("Hans", "Hansen", 20);
        customers[1] = new Customer("Mikkel", "Andersen", 25);
        customers[2] = new Customer("Mikkel", "Andersen", 23);
        customers[3] = new Customer("Morten", "Hansen", 49);

        System.out.println(lastCustomer(customers));
        System.out.println(Arrays.toString(afterCustomer(customers, customers[1])));

    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer lastCustomer = customers[0];
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].compareTo(lastCustomer) > 0) {
                lastCustomer = customers[i];
            }
        }
        return lastCustomer;
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        Customer[] afterCustomers = new Customer[customers.length];
        int j = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].compareTo(customer) > 0) {
                afterCustomers[j] = customers[i];
                j++;
            }
        }
        return afterCustomers;
    }
}
