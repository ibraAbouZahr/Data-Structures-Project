
public class Customer {
	int CustomerID;
	String CustomerName;
	CustomerQueue queue;
	ProductsStack shoppingCart;

	
	public Customer() {
		CustomerID = 0;
		CustomerName = null;
	}
	
	public Customer(int CustomerID, String CustomerName) {
		this.CustomerID = CustomerID;
		this.CustomerName = CustomerName;
		this.shoppingCart = new ProductsStack();
		
	}
	public CustomerQueue getQueue() {
		return queue;
	}

	public void setQueue(CustomerQueue queue) {
		this.queue = queue;
	}

	public ProductsStack getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ProductsStack shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public void AddtoShoppingCart(Product product) {
		shoppingCart.push(product);
		System.out.println("Added Sucessfully!");

	}

	public void RemoveFromShoppingCart() {
		if (!shoppingCart.isEmpty()) {
			Product removed = shoppingCart.pop();

			System.out.println("The product " + removed.getProductName() + " of ID " + removed.getProductID()
					+ " has been removed Sucessfully! ");
		} else {
			System.out.println("Your cart is Empty!");
		}
	}

	

}
