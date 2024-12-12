
public class Mall {
	String MallName;
	CustomerQueue customerqueue;
	EmployeeStack employeeStack;
	ProductsStack productsStack;
	ShopsLinkedList listofShops;

	public Mall() {
		MallName = null;
		customerqueue = null;
		employeeStack = null;
		productsStack = null;
		listofShops = null;
	}

	public Mall(String MallName) {
		this.MallName = MallName;

		this.listofShops = new ShopsLinkedList();
		this.productsStack = new ProductsStack();
		this.employeeStack = new EmployeeStack();
		this.customerqueue = new CustomerQueue();
	}

	public String getMallName() {
		return MallName;
	}

	public void setMallName(String mallName) {
		MallName = mallName;
	}

	public CustomerQueue getCustomerqueue() {
		return customerqueue;
	}

	public void setCustomerqueue(CustomerQueue customerqueue) {
		this.customerqueue = customerqueue;
	}

	public EmployeeStack getEmployeeStack() {
		return employeeStack;
	}

	public void setEmployeeStack(EmployeeStack employeeStack) {
		this.employeeStack = employeeStack;
	}

	public ProductsStack getProductsStack() {
		return productsStack;
	}

	public void setProductsStack(ProductsStack productsStack) {
		this.productsStack = productsStack;
	}

	public ShopsLinkedList getListofShops() {
		return listofShops;
	}

	public void setListofShops(ShopsLinkedList listofShops) {
		this.listofShops = listofShops;
	}

	public Shop getShopById(int shopId) {
		return listofShops.getShopById(shopId);
	}
	

	
	public String toString() {
		return "Mall{" +
                "mallName='" + MallName + '\'' +
                ", listOfShops=" + listofShops +
                ", customerQueue=" + customerqueue +
                ", employeeStack=" + employeeStack +
                '}';
	}

	public void AddShop(Shop shop) {
		listofShops.insertAtFront(shop);
	}

	public void RemoveShop() {
		listofShops.deleteFromFront();
	}

	public void CustomerEntries(Customer customer) {
		customerqueue.enqueue(customer);
		System.out.println("Welcome to " + MallName + " enjoy your stay!");
	}

}
