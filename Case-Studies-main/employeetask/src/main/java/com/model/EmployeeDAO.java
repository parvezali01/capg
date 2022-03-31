package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface EmployeeDAO extends CrudRepository<Employee,Integer> {

}
