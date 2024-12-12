
public class ProductsStack extends ProductsLinkedList {
	public ProductsStack() {
		super();
	}

	public Product pop() {
		return deleteFromFront();
	}

	public void push(Product product) {
		insertAtFront(product);
	}

	public Product peak() {
		return head.product;
	}

	public int StackSize() {
		int count = 0;
		Product a;
		ProductsStack temp = new ProductsStack();
		while (!isEmpty()) {
			a = pop();
			count++;
			temp.push(a);
		}
		while (!temp.isEmpty()) {
			a = temp.pop();
			push(a);
		}
		return count;
	}

}
