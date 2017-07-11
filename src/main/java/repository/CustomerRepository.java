package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
	public Customer findByUsername(String username);
}
