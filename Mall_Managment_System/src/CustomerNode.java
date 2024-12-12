
public class CustomerNode {
	Customer customer;
	CustomerNode next;

	public CustomerNode() {
		customer = null;
		next = null;
	}

	public CustomerNode(Customer customer) {
		this.customer = customer;
		this.next = null;
	}

}
