package model;

import java.util.Date;

public class User {
	public String username;
	public String password;
	public Role role;
	public String first_name;
	public String last_name;
	public Date created_at;
	
	public User() {
		super();
		this.created_at = new Date();
		this.role = Role.CUSTOMER;
	}
	
	public User(String username, String password, Role role, String first_name, String last_name, Date created_at) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.first_name = first_name;
		this.last_name = last_name;
		this.created_at = created_at;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", created_at=" + created_at + "]";
	}
	
	
}
