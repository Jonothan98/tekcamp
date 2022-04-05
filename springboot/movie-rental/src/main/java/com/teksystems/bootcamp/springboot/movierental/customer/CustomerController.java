package com.teksystems.bootcamp.springboot.movierental.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/api/customers")
    public Page<Customer> getAllCustomers(){
        return customerRepository.findAll(Pageable.ofSize(25));
    }

    @GetMapping("/api/customers/{id}")
    public Optional<Customer> getCustomersById(@PathVariable int id){
        return customerRepository.findById(id);
    }

    @DeleteMapping("/api/customers/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerRepository.deleteById(id);
    }

    @PostMapping("/api/customers")
    public ResponseEntity<Object> createCustomer(@Valid @RequestBody Customer customer){
        Customer savedCustomer = customerRepository.save(customer);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCustomer.getCustomer_id()).toUri();

        return ResponseEntity.created(location).build();
    }
}
