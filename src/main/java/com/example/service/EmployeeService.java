package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployee() {
	
		return employeeRepository.findAll();
	}


	public Optional<Employee> getEmployeeDetail(@PathVariable Integer employeeId) {
	
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		
		return employee;
	}
}
