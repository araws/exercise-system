package com.exercise.system.exercisesystem.repositories;

import com.exercise.system.exercisesystem.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByLastName(String lastName);

    List<Customer> findAllByLastNameLike(String lastName);
}
