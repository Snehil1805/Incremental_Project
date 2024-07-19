// package com.wecp.progressive.service;
 
// import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.repository.CustomerRepository;

// import java.util.Collections;
 
// @Service("customerServiceImplJpa")

// public class CustomerServiceImplJpa implements CustomerService {
//     @Autowired
//     private CustomerRepository customerRepository;

//     List<Customers> cus = new ArrayList<>();

//     @Override
//     public List<Customers> getAllCustomers() throws SQLException {
//         return customerRepository.findAll();
        
//     }

//     @Override
//     public Customers getCustomerById(int customerId) throws SQLException {
//         return customerRepository.findById(customerId).get();
        
//     }

//     @Override
//     public int addCustomer(Customers customers) throws SQLException {
//         return customerRepository.save(customers).getCustomerId();
//     }

//     @Override
//     public void updateCustomer(Customers customers) throws SQLException {
//         Customers c = customerRepository.findById(customers.getCustomerId()).orElse(null);
//         if(c != null){
//             c.setName(customers.getName());
//             c.setEmail(customers.getEmail());
//             c.setPassword(customers.getPassword());
//             c.setRole(customers.getRole());
//             c.setUsername(customers.getUsername());
//             customerRepository.save(c);
//         }
        
//     }

//     @Override
//     public void deleteCustomer(int customerId) throws SQLException {
//         customerRepository.deleteById(customerId);

        
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByName() throws SQLException {
//         return customerRepository.findAllByOrderByNameAsc();
        
//     }

//     @Override
//     public List<Customers> getAllCustomersFromArrayList() {
//         return cus;

        
//     }

//     @Override
//     public List<Customers> addCustomersToArrayList(Customers customers) {
//         cus.add(customers);
//         return cus;
        
        
//     }

//     @Override
//     public List<Customers> getAllCustomersSortedByNameFromArrayList() {
//         Collections.sort(cus);
//         return cus;
        
//     }

//     @Override
//     public void emptyArrayList() {
//         cus.clear();
        
//     }
   
// }