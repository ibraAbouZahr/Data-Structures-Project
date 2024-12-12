
public class EmployeeNode {
	Employee employee;
	EmployeeNode next;

	public EmployeeNode() {
		employee = null;
		next = null;
	}

	public EmployeeNode(Employee employee) {
		this.employee = employee;
		this.next = null;
	}

}
