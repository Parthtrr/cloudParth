package com.cg.ems_189105.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems_189105.dao.EmployeeRepository;
import com.cg.ems_189105.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	// Service Implementation
	// Using Autowired
	@Autowired
	EmployeeRepository pDao;

	// add method
	@Override
	public void addUser(Employee log) {
		// TODO Auto-generated method stub
		pDao.save(log);
	}

	// show all method
	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return pDao.getAllEmployee();
	}

	// update method
	@Override
	public void UpdateEmpInfo(String name, String desig, String dept, double sal, int id) {
		// TODO Auto-generated method stub
		pDao.UpdateEmpInfo(name, desig, dept, sal, id);
	}

	// get emp by id method
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return pDao.getEmployeeById(id);
	}

	// delete employee method
	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		pDao.deleteEmployeeById(id);
	}

}
