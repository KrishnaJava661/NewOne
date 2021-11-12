package com.info.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	/*
	@Autowired
	private IEmployeeService service;
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) {
		service.save(employee);
		return employee.getEmployeeId();
	}*/

@GetMapping("/fetch")
public String print() {
	return "Welcome to spring rest api";
}

}
