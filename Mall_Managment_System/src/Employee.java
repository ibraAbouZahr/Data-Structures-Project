
public class Employee {
	int EmployeeId;
	String EmployeeName;
	String Job;

	public Employee() {
		EmployeeId = 0;
		EmployeeName = null;
		Job = null;
	}

	public Employee(int EmployeeId, String EmployeeName, String Job) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.Job = Job;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}
	
	public void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.getCustomerName() + " welcome to Ibrahim's! How may I help you? ");
	}

}
