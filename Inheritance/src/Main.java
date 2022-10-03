
public class Main {
	// inheritence(miras)
	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.List();
		customerManager.Add();
		
		employeeManager.Add();
		employeeManager.List();		
		employeeManager.BestEmployee();
		
	}
}
