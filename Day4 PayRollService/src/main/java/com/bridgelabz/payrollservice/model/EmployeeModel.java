package com.bridgelabz.payrollservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.payrollservice.dto.EmployeeDTO;

@Entity
@Table(name = "Employee")
public class EmployeeModel {
	@Id
	private long employeeId;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private long salary;
	private String companyName;
	private String department;

	public EmployeeModel(EmployeeDTO dto) {
		this.firstName = dto.getFirstName();
		this.lastName = dto.getLastName();
		this.phoneNumber = dto.getPhoneNumber();
		this.salary= dto.getSalary();
		this.companyName = dto.getCompanyName();
		this.department = dto.getDepartment();
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public EmployeeModel() {

	}
}
