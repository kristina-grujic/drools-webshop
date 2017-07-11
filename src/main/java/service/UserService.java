package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserDTO;
import model.User;
import repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User findOne(String id) {
		return userRepository.findOne(id);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public void remove(String id) {
		userRepository.delete(id);
	}

	public User getEntity(UserDTO e) {
		return findOne(e.getUsername());
	}
}
