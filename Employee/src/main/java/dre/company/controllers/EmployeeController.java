package dre.company.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import dre.company.entities.Employee;
import dre.company.repositories.EmployeeRepository;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {
	
	
	private static final int String = 0;
	private static final int ResponseEntity = 0;
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


	@PutMapping("/{id}")
	public Employee upDate(@PathVariable Long id, @RequestBody Employee employee) {
		Employee current=repository.findById(id).get();
		BeanUtils.copyProperties(employee, current, "id");
		return repository.save(current);
		
	}
	
	
	@DeleteMapping("/employees/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
	
}
