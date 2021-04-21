package com.capg.lab7.service;

import java.util.List;

import com.capg.lab7.beans.Employee;

public interface IEmployeeServicee {

	public void insertingEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByScheme(String s);
	public boolean removeEmployee(int id); 
}