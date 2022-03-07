package com.exercise.system.exercisesystem.services;

import com.exercise.system.exercisesystem.model.Customer;

import java.util.List;

public interface CustomerService extends CrudService<Customer, Long> {
    Customer findByLastName(String lastName);

    List<Customer> findAllByLastNameLike(String lastName);
}
