
public class EmployeeLinkedList {
	EmployeeNode head;

	public EmployeeLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;

		}
		return false;
	}

	public void insertAtFront(Employee employee) {
		EmployeeNode n = new EmployeeNode(employee);

		if (isEmpty()) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void insertAtBack(Employee employee) {
		EmployeeNode n = new EmployeeNode(employee);
		if (isEmpty()) {
			head = n;
		} else {
			EmployeeNode current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.next = n;
		}
	}

	public Employee deleteFromFront() {
		if (!isEmpty()) {
			Employee p = head.employee;

			head = head.next;
			return p;
		} else {
			return null;
		}
	}

	public void display() {
		EmployeeNode current = head;

		while (current != null) {
			System.out.println("ID: "+current.employee.EmployeeId);
			System.out.println("Employee Name:" + current.employee.EmployeeName);
			System.out.println("Employee Job Title: " + current.employee.Job);
			current = current.next;
		}
	}

}
