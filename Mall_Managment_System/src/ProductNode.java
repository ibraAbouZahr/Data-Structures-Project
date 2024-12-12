
public class ProductNode {
	public Product product;
	ProductNode next;
	
	public ProductNode() {
		product = null;
		next = null;
	}
	public ProductNode(Product product) {
		this.product = product;
		this.next = null;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductNode getNext() {
		return next;
	}
	public void setNext(ProductNode next) {
		this.next = next;
	}


}
