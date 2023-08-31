package Opgave3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Models a Opgave3.Customer with Orders.
 */
public class Customer {
	private String name;
	private LocalDate birthday;
	private Discount discount;
	private List<Order> orders = new ArrayList<Order>();

	/**
	 * Create a new Opgave3.Customer.
	 * 
	 * @param name     the name.
	 * @param birthday birthday of the customer.
	 */
	public Customer(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>(orders);
	}

	public void addOrder(Order order) {
		if (!orders.contains(order)) {
			orders.add(order);
		}
	}

	public void removeOrder(Order order) {
		if (orders.contains(order)) {
			orders.remove(order);
		}
	}

	public double totalBuy(){
		double total = 0;
		for(Order o : orders){
			total += o.getOrderPrice(o);
		}
		return total;
	}

	public void setDiscount(Discount discount) {
		if (this.discount != discount) {
			this.discount = discount;
		}

	}



}
