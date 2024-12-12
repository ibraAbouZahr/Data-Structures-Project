import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Ibra's Mall!");

		Mall IbraMall = new Mall("IbraMall");

		Shop s1 = new Shop(1, "H&M");
		Shop s2 = new Shop(2, "Nike");
		Shop s3 = new Shop(3, "StarBucks");

		IbraMall.AddShop(s1);
		IbraMall.AddShop(s2);
		IbraMall.AddShop(s3);

		// for H&M
		Product product1 = new Product(101, "Blue Hoodie", 34.99);
		Product product2 = new Product(102, "Sweatpants", 49.99);
		Product product3 = new Product(103, "Denim Jacket", 79.99);
		// for Nike
		Product product4 = new Product(201, "Air Forces", 119.99);
		Product product5 = new Product(202, "Training Shirt", 49.99);
		Product product6 = new Product(203, "Sweatshirt", 59.99);
		// for Starbucks
		Product product7 = new Product(301, "Latte", 4.99);
		Product product8 = new Product(302, "Smoothie", 5.99);
		Product product9 = new Product(303, "Cake", 9.99);

		s1.getListOfProducts().insertAtFront(product1);
		s1.getListOfProducts().insertAtFront(product2);
		s1.getListOfProducts().insertAtFront(product3);

		s2.getListOfProducts().insertAtFront(product4);
		s2.getListOfProducts().insertAtFront(product5);
		s2.getListOfProducts().insertAtFront(product6);

		s3.getListOfProducts().insertAtFront(product7);
		s3.getListOfProducts().insertAtFront(product8);
		s3.getListOfProducts().insertAtFront(product9);

		System.out.println("-----------------------");

		int customerId;
		String customerName;
		System.out.println("Please enter your ID: ");
		customerId = scan.nextInt();
		System.out.println("Enter you name: ");
		customerName = scan.next();

		Customer customer = new Customer(customerId, customerName);

		IbraMall.getCustomerqueue().enqueue(customer);

		System.out.println("Hello, " + customer.getCustomerName() + ". How can we help you?");
		int c;
		do {
			System.out.println("Options: ");
			System.out.println("1. View Shops");
			System.out.println("2. View your shopping cart");
			System.out.println("For Managment ONLY:");
			System.out.println("3. Employee Information");
			System.out.println("4. Employee Managment ");
			System.out.println("5. Exit");

			System.out.println("Pick your choice: ");
			c = scan.nextInt();

			switch (c) {
			case 1:
				System.out.println("The available shops in the mall: ");
				IbraMall.getListofShops().display();
				System.out.println("Select a shop you want to view (enter shop's number): ");
				int shopChoice;
				shopChoice = scan.nextInt();

				Shop selected = IbraMall.getShopById(shopChoice);
				if (selected != null) {
					selected.getListOfProducts().displayProducts();
					System.out.println("Select a product you are interested in (enter product's id):");
					int selectedProduct = scan.nextInt();

					Product selectedProductChoice = selected.getListOfProducts().getProductById(selectedProduct);
					if (selectedProductChoice != null) {
						selected.CustomerPurchase(customer, selectedProductChoice);

						System.out.println("-----------------------");

					} else {
						System.out.println("Invalid Choice!");
						System.out.println("-----------------------");
					}

				}
				break;
			case 2:
				System.out.println("Your Shopping Cart: ");
				customer.getShoppingCart().displayProducts();
				System.out.println("-----------------------");
				break;

			case 3:
				System.out.println("Employee Inforation: ");
				IbraMall.getEmployeeStack().display();
				System.out.println("----------------------------------------");

			case 4:
				System.out.println("Employee Managment: ");
				System.out.println("1. Add Employee");
				System.out.println("2. Remove Employee");
				System.out.println("3. Go Back");
				System.out.println("Enter your choice: ");
				int EmployeeChoice = scan.nextInt();

				switch (EmployeeChoice) {
				case 1:
					int EmployeeId;
					String EmployeeName;
					String EmployeeJobTitle;
					System.out.println("Enter the Employee ID: ");
					EmployeeId = scan.nextInt();
					System.out.println("Enter the Employee's Name:");
					EmployeeName = scan.next();
					System.out.println("Enter the Employee's Job Title: ");
					EmployeeJobTitle = scan.next();

					Employee newEmployee = new Employee(EmployeeId, EmployeeName, EmployeeJobTitle);

					IbraMall.getEmployeeStack().push(newEmployee);
					System.out.println("New Employee assigned!");
					System.out.println("-----------------------------------------");
					System.out.println();
					break;
				case 2:
					if (!IbraMall.getEmployeeStack().isEmpty()) {
						Employee removed = IbraMall.getEmployeeStack().pop();
						System.out.println("Employee removed! ");
					} else {
						System.out.println("No employee to remove!");
					}
					System.out.println("--------------------------------------");
					
				case 3:
					break;
					
				default:
					System.out.println("Invalid Choice!");
					System.out.println("----------------------------------------");
					break;

				}
				

			case 5:
				System.out.println("Thank you for shopping at Ibra's Mall!");
				System.out.println("----------------------------------------");
				break;

			default:
				System.out.println("Invalid Choice!");
				System.out.println("----------------------------------------");
				break;
			}
		} while (c != 5);
	}

}
