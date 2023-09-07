package CustomerOpgaver;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        customers[0] = new Customer("Helmig", "Hansen", 20);
        customers[1] = new Customer("Mikkel", "Andersen", 25);
        customers[2] = new Customer("Morten", "Andersen", 23);
        customers[3] = new Customer("Mathias", "Andersen", 49);

        System.out.println(lastCustomer(customers));
        System.out.println(Arrays.toString(afterCustomer(customers, customers[0])));

    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer lastCustomer = customers[0];
        for (Customer c : customers) {
            if (c.compareTo(lastCustomer) > 0) {
                lastCustomer = c;
            }
        }
        return lastCustomer;
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        Customer[] afterCustomers = new Customer[customers.length];
        int i = 0;
        for (Customer c : customers) {
            if (c.compareTo(customer) < 0) {
                afterCustomers[i] = c;
                i++;
            }
        }
        return afterCustomers;
    }
}
