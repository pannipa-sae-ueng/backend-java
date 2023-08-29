package com.example.controller;
import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	//EmployeeRepository employeeRepository;
	
	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		//return employeeRepository.findAll();
		return employeeService.getEmployee();
	}
	
	
	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer employeeId) {
		java.util.Optional<Employee> employee = employeeService.getEmployeeDetail(employeeId);
        if(!employee.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
		
	}
	
	
	 
	
	
	
	
	
	/*

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee body) {
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getEmployeeID() == body.getEmployeeID()) {
				return null;
			}
		}

		data.add(body);
		return body;
	}
	
	@PutMapping("/employee/{employeeId}")
	public String updateEmployee(@PathVariable("employeeId") Integer employeeId, @RequestBody Employee body) {
		for(int i = 0; i < data.size(); i++) {
			if(data.get(i).getEmployeeID().equals(employeeId)) {
				((Employee) data).setFirstname(body.getFirstname());
	           
				return "Update Employee Success";
			}
		}
		return "Error Update Employee";
	}
	*/

}
