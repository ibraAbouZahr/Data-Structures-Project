
public class CustomerLinkedList {
	CustomerNode head;

	public CustomerLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void insertAtFront(Customer customer) {
		CustomerNode c = new CustomerNode(customer);
		if (isEmpty()) {
			head = c;
		}
		c.next = head;
		head = c;
	}
	public void insertAtBack(Customer customer) {
		CustomerNode c = new CustomerNode(customer);
		if (isEmpty()) {
			head = c;
		}
		else {
			CustomerNode current = head;
			while(current.next!= null) {
				current = current.next;
			}
			
			current.next = c;
		}
		
	}

	public Customer deleteFromFront() {
		if (!isEmpty()) {
			Customer c = head.customer;
			head = head.next;
			return c;

		}
		return null;
	}

	public void display1() {
		CustomerNode current = head;
		
		while(current!= null) {
			System.out.println("Customer ID is: " + current.customer.CustomerID);
		}

	}
}
