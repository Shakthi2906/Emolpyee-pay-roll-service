package com.bridgelabz.payrollservice.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.payrollservice.dto.EmployeeDTO;
import com.bridgelabz.payrollservice.model.EmployeeModel;
@Service
public interface IEmployeeService {

	EmployeeModel addEmployee(EmployeeDTO employeeDTO);

	EmployeeModel updateEmployeeById(EmployeeDTO employeeDTO, long id);


}
