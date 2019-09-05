package com.cg.ems_189105.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee189105")
public class Employee {
	// table
	// Dto class
	// Generating the id automatically
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id", length = 15)
	private int eid;
	@Column(name = "name", length = 15)
	private String eName;
	@Column(name = "Designation", length = 15)
	private String eDesig;
	@Column(name = "dept_name", length = 15)
	private String dept;
	@Column(name = "Salary", length = 15)
	private double eSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String eName, String eDesig, String dept, double eSal) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eDesig = eDesig;
		this.dept = dept;
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eDesig=" + eDesig + ", dept=" + dept + ", eSal=" + eSal
				+ "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesig() {
		return eDesig;
	}

	public void seteDesig(String eDesig) {
		this.eDesig = eDesig;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
}
