package it.SpringDataJPA.application.repository;

import it.SpringDataJPA.application.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
