package com.exercise.system.exercisesystem.services.springdatajpa;

import com.exercise.system.exercisesystem.model.Customer;
import com.exercise.system.exercisesystem.repositories.CustomerRepository;
import com.exercise.system.exercisesystem.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class CustomerSDJpaService implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerSDJpaService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Set<Customer> findAll() {
        Set<Customer> customers = new HashSet<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        log.debug("Saving a customer...");
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        log.debug("Deleting a customer...");
        customerRepository.delete(customer);
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting a customer...");
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }

    @Override
    public List<Customer> findAllByLastNameLike(String lastName) {
        return customerRepository.findAllByLastNameLike(lastName);
    }
}
