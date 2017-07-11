package dto;

import model.Customer;

public class CustomerDTO {

	private String username;

	private String firstName;

	private String lastName;

	private String address;

	private String password;
	
	public CustomerDTO() {
		super();
	}

	public CustomerDTO(Customer user) {
		super();
		this.username = user.getUsername();
		this.firstName = user.getFirst_name();
		this.lastName = user.getLast_name();
		this.address = user.getAddress();
	}

	

	public CustomerDTO(String username, String firstName, String lastName, String address, String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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
	
	public String getAddress() {
		return address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
