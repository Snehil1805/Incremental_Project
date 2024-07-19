package com.wecp.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers,Integer> {
    List<Customers> findAllByOrderByNameAsc();

}
