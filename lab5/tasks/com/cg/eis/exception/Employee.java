package lab5.tasks.com.cg.eis.exception;

public class Employee {

	private double salary;
	
    public Employee(double salary) throws EmployeeException{
		
		if(salary >= 3000) {
			this.salary = salary;
		}
		else {
			throw new EmployeeException(salary);
		}
    }
		
}
