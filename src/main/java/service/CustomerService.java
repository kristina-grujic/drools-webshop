package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CustomerDTO;
import model.Customer;
import repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository userRepository;

	public Customer findOne(String id) {
		return userRepository.findOne(id);
	}

	public List<Customer> findAll() {
		return userRepository.findAll();
	}

	public Customer save(Customer user) {
		return userRepository.save(user);
	}

	public void remove(String id) {
		userRepository.delete(id);
	}

	public Customer getEntity(CustomerDTO e) {
		return findOne(e.getUsername());
	}
}
