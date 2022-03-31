package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRatingDAO extends CrudRepository<EmployeeRating, Integer> {

}
