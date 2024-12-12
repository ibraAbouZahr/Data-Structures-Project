
public class ProductsLinkedList {
	ProductNode head;

	public ProductsLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;

		}
		return false;
	}

	public void insertAtFront(Product product) {
		ProductNode n = new ProductNode(product);

		if (isEmpty()) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void insertAtBack(Product product) {
		ProductNode n = new ProductNode(product);
		if (isEmpty()) {
			head = n;
		} else {
			ProductNode current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.setNext(n);
		}
	}

	public Product deleteFromFront() {
		if (!isEmpty()) {
			Product p = head.product;

			head = head.next;
			return p;
		} else {
			return null;
		}
	}

	public void displayProducts() {
		ProductNode current = head;

		while (current != null) {
			System.out.println("ID: " + current.product.productID);
			System.out.println("Name: " + current.product.productName);
			System.out.println("Price: " + current.product.productPrice + "$");
			System.out.println();
			current = current.next;
		}
	}

	public Product getProductById(int productId) {
		ProductNode current = head;
		while (current != null) {
			if (current.getProduct().getProductID() == productId) {
				return current.getProduct();
			}
			current = current.getNext();
		}
		return null;
	}

	public void removeProduct(int productId) {
		if (head == null) {
			return; 
		}

		if (head.getProduct().getProductID() == productId) {
			
			deleteFromFront();
			// in order to remove first node
		}

		ProductNode current = head;
		while (current.getNext() != null && current.getNext().getProduct().getProductID() != productId) {
			current = current.getNext();
		}

		if (current.getNext() != null) {
			current.setNext(current.getNext().getNext());
		}
	}

	public boolean ProductFound(Product product) {
		ProductNode current = head;
		while (current != null) {
			if (current.getProduct().equals(product)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

}
