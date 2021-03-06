package com.capg.lab7.main;

import java.util.List;
import java.util.Scanner;

import com.capg.lab7.beans.Employee;
import com.capg.lab7.service.EmployeeServiceImpl;
//import com.capg.lab7.ui.MainUIClass;
import com.capg.lab7.service.*;

public class MainClass {

	Scanner in = new Scanner(System.in);

		IEmployeeServicee empService;
		public MainClass() {
			empService = new EmployeeServiceImpl();
			//sc = new Scanner(System.in);
		}
		
		public static void main(String[] args) {
			MainClass obj = new MainClass();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter");
			while(true) {
				System.out.println("1. To insert Employee information\n2. To Display all Employees\n3. To display employee details by scheme\n4. To remove the employee\n5. Exit");
			
				int num= sc.nextInt();
				switch(num) {
				case 1:
					obj.insertEmployeeInforamtion();
					break;
				case 2:
					
					obj.displayAllEmployee();
					break;
				case 3:
					obj.displayEmployeesByScheme();
					break;
				case 4:
					obj.removeEmployeeDetails();
					break;
				case 5:
					System.exit(0);
					
				}
			}
		}
		
		public void insertEmployeeInforamtion()
		{
			Scanner in = new Scanner(System.in);
			System.out.println(" \n Enter Employee Information\n");
			System.out.println(" Enter Employee Name ");
			String empName = in.nextLine();
			
			System.out.println(" Enter Employee Id ");
			int id = Integer.parseInt(in.nextLine());
			
			System.out.println(" Enter Employee Salary ");
			int salary = Integer.parseInt(in.nextLine());
			
			System.out.println(" Enter Employee Designation ");
			String designation = in.nextLine();
			
			Employee e = new Employee(empName,id,salary,designation);
			
			
			empService.insertingEmployee(e);
			
			
		}
		
		public void displayAllEmployee()
		{
			
			System.out.println("\n=========== Employees Information ===========\n");
			List<Employee> empList = empService.getAllEmployees();
			
			for (Employee employee : empList) {
				displayEmployee(employee);
			}
		}
		
		public void displayEmployee(Employee e)
		{
			System.out.println(" Name "+ e.getEmpName());
			System.out.println(" ID "+ e.getId());
			System.out.println(" Salary "+e.getSalary());
			System.out.println("\n---------------------------------------------\n");
			
			
		}
		
		
		
		public void removeEmployeeDetails() {
			//Scanner in = new Scanner(System.in);
			System.out.println("Enter the employee id");
			int id = Integer.parseInt(in.nextLine());
			empService.removeEmployee(id);
		}

}