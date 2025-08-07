package lk.ijse.project.springdeployment.service.impl;

import lk.ijse.project.springdeployment.entity.Customer;
import lk.ijse.project.springdeployment.repo.CustomerRepository;
import lk.ijse.project.springdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customerById = customerRepository.getCustomerById(customer.getId());
        customerById.setName(customer.getName());
        customerById.setAge(customer.getAge());
        customerRepository.save(customerById);
        return customerById;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.deleteById(customer.getId());
}

}
