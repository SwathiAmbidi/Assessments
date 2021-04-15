package day7.task1;

import java.util.Arrays;
import java.util.HashMap;

public class EmployeeService {

	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}
		
		return codes;
	}
	public String[] getEmployeeLocations()
	{
		String loc[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			loc[++count] = empid.substring(6, 9);
		}
		
		return loc;
	}
	
	public void getEmployeeCity(String empid) throws EmployeeException
	 {
	
			if(empid.substring(0,3).contentEquals("011"))
			{				
				System.out.println(" : Delhi");
				
			}
			else if(empid.substring(0,3).contentEquals("022"))			
			{
				
				System.out.println(" : Mumbai");
				
			}
			
			
			else if(empid.substring(0,3).contentEquals("080"))
				
			{
				
				System.out.println(" : Bangalore");
				
			}
			
			else if(empid.substring(0,3).contentEquals("020"))
				
			{
				
				System.out.println(" : Pune");
				
			}
			
			
			else
			{
				throw new EmployeeException("Invalid Pincode");
			}
	 }

	@Override
	public String toString() {
		return "EmployeeService [employees=" + Arrays.toString(employees) + "]";
	}
}






