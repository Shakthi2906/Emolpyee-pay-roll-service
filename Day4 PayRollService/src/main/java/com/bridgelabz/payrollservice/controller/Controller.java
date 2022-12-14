package com.bridgelabz.payrollservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.payrollservice.dto.EmployeeDTO;
import com.bridgelabz.payrollservice.model.EmployeeModel;
import com.bridgelabz.payrollservice.service.IEmployeeService;

@RestController
@RequestMapping("/employeepayroll")
public class Controller {
	@Autowired
	IEmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public EmployeeModel addEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.addEmployee(employeeDTO);
	}
	
	@PutMapping("/updateemployee/{id}")
	public EmployeeModel updateEmployee(@RequestBody EmployeeDTO employeeDTO, @PathVariable long id) {
		return employeeService.updateEmployeeById(employeeDTO,id);
	}
}
