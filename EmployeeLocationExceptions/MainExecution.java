package day7.task1;

public class MainExecution {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		
		
		String loc[] = service.getEmployeeLocations();
		
		for (String empid : codes) {
			System.out.println(empid);
		}



		for(String s: loc)
			try {
				service.getEmployeeCity(s);
			}
			catch(EmployeeException e) {
				System.out.println(e.getMessage());
			}
			//System.out.println(empid);
		}

	
		//service.empIdAndLocation();
	}//end main
	

