package com.cg.ems_189105.ctrl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems_189105.Exception.EmployeeNotFoundException;
import com.cg.ems_189105.dto.Employee;
import com.cg.ems_189105.service.EmployeeService;

@RestController
public class EmsCtrl {

	@Autowired
	EmployeeService pSer;

	// Will print the Welcome message
	@GetMapping(value = "/Welcome")
	public String getWelcomeMessage() {
		return "Welcome to MPT3";
	}

	// Function to add the Employee
	@PostMapping(value = "/addEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public Employee addEmployee(@RequestBody Employee log) {
		pSer.addUser(log);
		System.out.println("employee added");
		Employee log1 = pSer.getEmployeeById(log.getEid());
		return log1;
	}

	// Function to Show all Employee
	@RequestMapping(value = "/showAllEmployee", method = RequestMethod.GET, headers = "Accept=application/json")
	public ArrayList<Employee> showAllUsers() {
		System.out.println("----showAllUser---");
		return pSer.getAllEmployee();
	}

	// Function to update the Employee
	@PutMapping(value = "/Employee/update/", consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public Employee UpdateUserInfo(@RequestBody Employee lg) {
		pSer.UpdateEmpInfo(lg.geteName(), lg.geteDesig(), lg.getDept(), lg.geteSal(), lg.getEid());
		System.out.println("Data updated in the table");
		Employee log1 = pSer.getEmployeeById(lg.getEid());
		return log1;
	}

	// Function to get Employee by passing id
	@GetMapping(value = "/getEmployee/{uid}", consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public Employee getEmployeeById(@PathVariable("uid") int id) throws EmployeeNotFoundException {
		Employee log = pSer.getEmployeeById(id);
		// to check if the entered id is correct or not
		if (log == null) {
			throw new EmployeeNotFoundException("Wrong Product Id");
		} else {
			return log;
		}

	}

	// Function to delete the Employee
	@DeleteMapping(value = "/deleteEmployee/{uid}", headers = "Accept=application/json")
	public String deleteUser(@PathVariable("uid") int id) {
		pSer.deleteEmployeeById(id);
		System.out.println("Data deleted .....");
		return "Data deleted .....";
	}

}
