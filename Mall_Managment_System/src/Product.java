
public class Product {
	int productID;
	String productName;
	double productPrice;

	public Product() {
		productID = 0;
		productName = null;
		productPrice = 0.0;
	}

	public Product(int productID, String productName, double productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;

	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double PriceAfterTax(double TaxRate) {
		double tax = productPrice * (TaxRate / 100);
		double price = tax + productPrice;

		return price;
	}

}
