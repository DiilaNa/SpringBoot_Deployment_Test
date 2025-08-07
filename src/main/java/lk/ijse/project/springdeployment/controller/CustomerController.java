package lk.ijse.project.springdeployment.controller;

import lk.ijse.project.springdeployment.entity.Customer;
import lk.ijse.project.springdeployment.repo.CustomerRepository;
import lk.ijse.project.springdeployment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("get")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping("create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("delete")
    public void deleteCustomer(@RequestBody Customer customer) {
        customerService.deleteCustomer(customer);
    }

}
