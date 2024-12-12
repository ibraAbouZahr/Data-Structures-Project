
public class CustomerQueue extends CustomerLinkedList {
	public CustomerQueue() {
		super();

	}

	public void enqueue(Customer customer) {
		insertAtBack(customer);
	}

	public Customer dequeue() {
		return deleteFromFront();
	}

	public void display() {
		super.display1();
	}

	public int QueueSize() {
		int count = 0;
		Customer a;
		CustomerQueue temp = new CustomerQueue();
		while (!isEmpty()) {
			a = dequeue();
			count++;
			temp.enqueue(a);

		}
		while(!temp.isEmpty()) {
			a = temp.dequeue();
			enqueue(a);
		}
		return count;
	}

}
