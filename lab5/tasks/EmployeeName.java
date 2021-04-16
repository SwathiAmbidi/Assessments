package lab5.tasks;

public class EmployeeName {

	private String f,l;
	public EmployeeName(String firstName,String lastName) throws EmployeeNameException{
		
		if(firstName.isEmpty() && lastName.isEmpty()) {
			throw new  EmployeeNameException(firstName,lastName);
			
		}
		else {
			this.l = l;
			this.f = f;
					
		}
		
		
	}
	@Override
	public String toString() {
		return "EmployeeName [f=" + f + ", l=" + l + "]";
	}
	
	
	
}
