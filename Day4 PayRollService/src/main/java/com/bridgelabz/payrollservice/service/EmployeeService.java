package com.bridgelabz.payrollservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.payrollservice.dto.EmployeeDTO;
import com.bridgelabz.payrollservice.model.EmployeeModel;
import com.bridgelabz.payrollservice.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeModel addEmployee(EmployeeDTO employeeDTO) {
		EmployeeModel model = new EmployeeModel(employeeDTO);
		employeeRepository.save(model);
		return model;
	}

	@Override
	public EmployeeModel updateEmployeeById(EmployeeDTO employeeDTO, long id) {
		Optional<EmployeeModel> isEmployeePresent = employeeRepository.findById(id);
		if(isEmployeePresent.isPresent()) {
			isEmployeePresent.get().setFirstName(employeeDTO.getFirstName());
			isEmployeePresent.get().setLastName(employeeDTO.getLastName());
			isEmployeePresent.get().setCompanyName(employeeDTO.getCompanyName());
			isEmployeePresent.get().setDepartment(employeeDTO.getDepartment());
			isEmployeePresent.get().setPhoneNumber(employeeDTO.getPhoneNumber());
			isEmployeePresent.get().setSalary(employeeDTO.getSalary());
		}
		return null;
	}
}
