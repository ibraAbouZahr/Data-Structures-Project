public class EmployeeStack extends EmployeeLinkedList {
	
	public EmployeeStack() {
		super();
	}

	public Employee pop() {
		return deleteFromFront();
	}

	public void push(Employee employee) {
		insertAtFront(employee);
	}

	public Employee peak() {
		return head.employee;
	}

	public int EmployeeStackSize() {
		int count = 0;
		Employee a;
		EmployeeStack temp = new EmployeeStack();
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