package dto;

import model.User;

public class UserDTO {

	private String username;

	private String firstName;

	private String lastName;

	private String password;
	
	public UserDTO() {
		super();
	}

	public UserDTO(User user) {
		super();
		this.username = user.getUsername();
		this.firstName = user.getFirst_name();
		this.lastName = user.getLast_name();
	}

	

	public UserDTO(String username, String firstName, String lastName, String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
