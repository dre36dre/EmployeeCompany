package dre.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dre.company.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
