package lk.ijse.project.springdeployment.repo;

import lk.ijse.project.springdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer getCustomerById(int id);
}
