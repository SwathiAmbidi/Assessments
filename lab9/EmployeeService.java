package lab9;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {

	Employee em = new Employee();
	EmployeeRepository e = new EmployeeRepository();
	List<Employee> emp = e.getEmployees();
	List<Department> dep = e.getDepartments();
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		EmployeeService obj = new EmployeeService();
		while(true) {
			System.out.println("1.salary of all employees\n2.senior most employee\n3.Department names and count of employees\n4.salary increment\n5. List of employees along with their hire date");
			int opt = in.nextInt();
			if(opt==1)
			{
			
				obj.salaryOfAllEmployees();
			}
			if(opt==2)
			{
				obj.seniorMostEmployee();
				
			}
			if(opt==3)
			{
				obj.departmentNames();
				
			}
			if(opt==4) obj.salaryIncrement();
			if(opt == 5) obj.getEmployeeList();
		}
		
		
		//obj.employeesWithoutDepartment();
		
	}
	
	
	
	public void salaryOfAllEmployees() {
		Double salary = emp.stream().map(Employee->Employee.getSalary()).reduce(0.0,(ans,i)->ans+i);
		System.out.println(salary);
		
	}
	public void departmentNames() {
		Map<Object, List<Employee>> temp = emp.stream().collect(Collectors.groupingBy(Em->em.getDepartment().getDepartmentName()));
		temp.forEach((dep,count)->System.out.println("Employees count in "+dep+" are "+count.size()));
		//HashSet<Department, Long> entrySet = temp.entrySet();
		//temp.forEach((Department, count)->System.out.printf("%s has %d employee(s)%n", Department,count));
		
	}
	public void salaryIncrement() {
		
		//List<Employee> temp = emp.stream().forEach(e -> e.salaryIncrement(0.15);
		Stream<Employee> stream = emp.stream();
		stream.forEach(em->System.out.println("Employee: "+em.getFirstName()+"\n Salary: "+em.getSalary()+"\nincreased salary: "+(em.getSalary()+em.getSalary()*0.15)));
	}
	
	public void seniorMostEmployee() {
		System.out.println(emp.stream().sorted(Comparator.comparingInt(Employee->Employee.getHireDate().getYear())).findFirst());
		
		
	}
	
	public void employeesWithoutDepartment() {
	/*	List<Employee> temp = emp.stream().filter(Emplpoyee->Employee.getDepartment().equals("")).collect(Collectors.toList());
		
		for(Employee e: temp)
			System.out.println(e);
		*/
		
	}
	public void getEmployeeList() {
		emp.stream().forEach(em->System.out.println("Name: "+em.getFirstName()+" "+em.getLastName()+"\nHire Date: "+em.getHireDate()+"\nDay: "+em.getHireDate().getDayOfWeek()));
		
	}	

}
