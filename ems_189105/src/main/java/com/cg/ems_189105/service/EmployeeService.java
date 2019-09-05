package com.cg.ems_189105.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cg.ems_189105.dto.Employee;

@Service
public interface EmployeeService {
	// Employee Service Interface
	public void addUser(Employee log);

	public ArrayList<Employee> getAllEmployee();

	public void UpdateEmpInfo(String name, String desig, String dept, double sal, int id);

	public Employee getEmployeeById(int id);

	public void deleteEmployeeById(int id);
}
