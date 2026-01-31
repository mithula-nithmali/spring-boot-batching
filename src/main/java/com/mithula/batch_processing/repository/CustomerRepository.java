package com.mithula.batch_processing.repository;

import com.mithula.batch_processing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {
}
