
public class Shop {
	int ShopID;
	String ShopName;
	ProductsLinkedList ListOfProducts;
	
	public Shop() {
		ShopID = 0;
		ShopName = null;
		ListOfProducts = null;
		
	}
	public Shop(int ShopID, String ShopName) {
		this.ShopID = ShopID;
		this.ShopName = ShopName;
		 this.ListOfProducts = new ProductsLinkedList();
	}
	
	public int getShopID() {
		return ShopID;
	}
	public void setShopID(int shopID) {
		ShopID = shopID;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public ProductsLinkedList getListOfProducts() {
		return ListOfProducts;
	}
	public void setListOfProducts(ProductsLinkedList listOfProducts) {
		ListOfProducts = listOfProducts;
	}
	public void AddProducts(Product product) {
		ListOfProducts.insertAtBack(product);
		
	}
	public void RemoveProducts() {
		ListOfProducts.deleteFromFront();
	}
	public void DisplayProduct() {
		System.out.println("The products in stock at " + ShopName + " are:" );
		ListOfProducts.displayProducts();
	}
	public void CustomerPurchase(Customer customer, Product product) {
		
			if(ListOfProducts.ProductFound(product)) {
				ListOfProducts.removeProduct(product.getProductID());
				// add the selected product to the shopping cart
				customer.getShoppingCart().push(product);
				System.out.println(product.getProductName() + " purchase from " + ShopName + " is successful!");
				
			}
			else {
				System.out.println("The selected product is not available in " + ShopName + ".");
			}
		}
	
	public void Discount(Customer customer, Product product) {
		System.out.println(customer.getCustomerName() + " we currently have a 30% discount on most products for Christmas Holidays! ");
		double discount = product.getProductPrice()*0.7;
		System.out.println("The price of "+ product.getProductName() + " after discounting is: " + discount  );
		
	}

}
