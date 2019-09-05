package com.cg.ems_189105.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ems_189105.dto.Employee;

@Repository("employeeJpaDao")
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	//Dao class
	//query for getting all the employees
	@Query("Select empList From Employee empList")
	public ArrayList<Employee> getAllEmployee();

	// query for update the employees
	@Modifying
	@Query("Update Employee log SET log.eName=:nm , log.eDesig=:desig , log.dept=:dept , log.eSal=:sal where log.eid=:id")
	public void UpdateEmpInfo(@Param("nm") String name, @Param("desig") String desig, @Param("dept") String dept,
			@Param("sal") double sal, @Param("id") int id);
	//query for get the employees
	@Query("Select log From Employee log where log.eid=:id")
	public Employee getEmployeeById(@Param("id") int id);
	//query for delete  the employees
	@Modifying
	@Query("Delete from Employee log where log.eid=:id")
	public void deleteEmployeeById(@Param("id") int id);
}
