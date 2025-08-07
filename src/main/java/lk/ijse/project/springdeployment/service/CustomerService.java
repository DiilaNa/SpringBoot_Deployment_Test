package lk.ijse.project.springdeployment.service;

import lk.ijse.project.springdeployment.entity.Customer;

import java.util.List;

public interface CustomerService {
     List<Customer> getCustomers();
     Customer getCustomer(int id);
     Customer createCustomer(Customer customer);
     Customer updateCustomer(Customer customer);
     void deleteCustomer(Customer customer);

}
