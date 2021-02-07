package Assignment1;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerMain project = new CustomerMain();
		project.run();

	}

	public void run() {
		Customer customers[] = new Customer[3];
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.name = "Siddharth";
		customer1.balance = 5000;

		Customer customer2 = new Customer();
		customer2.id = 2;
		customer2.name = "ABCD";
		customer2.balance = 6000;

		Customer customer3 = new Customer();
		customer3.id = 3;
		customer3.name = "EFGH";
		customer3.balance = 5500;

		customers[0] = customer1;
		customers[1] = customer2;
		customers[3] = customer3;

		for (int i = 0; i < customers.length; i++) {
			display(customers[i]);

		}
	}

	void display(Customer customer) {
		System.out.println("Customer" + customer.id + " " + customer.name + " " + customer.balance);

	}
}
