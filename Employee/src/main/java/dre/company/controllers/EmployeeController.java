package dre.company.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dre.company.entities.Employee;
import dre.company.repositories.EmployeeRepository;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping
	public List<Employee>  findAll(){
		List<Employee> result=repository.findAll();
		return result;
	}
	@GetMapping(value="/{id}")
	public Employee  findById(@PathVariable Long id){
		Employee result=repository.findById(id).get();
		return result;
	}
	@PostMapping
	public Employee  insert(@RequestBody  Employee employee){
		Employee result=repository.save(employee);
		return result;
	}
	
	
	
}
