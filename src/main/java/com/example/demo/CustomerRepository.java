package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
