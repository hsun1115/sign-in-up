package com.hsun.login.model;

import java.util.List;
import javax.persistence.*;

@Entity(name = "user")
public class User {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	
	@OneToMany(mappedBy="user", cascade= {CascadeType.PERSIST})
	private List<ContGroup> contgroup;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<ContGroup> getContgroup() {
		return contgroup;
	}
	public void setContgroup(List<ContGroup> contgroup) {
		this.contgroup = contgroup;
	}
	
//	public List<Contact> getContacts() {
//		return contacts;
//	}
//	public void setContacts(List<Contact> contacts) {
//		this.contacts = contacts;
//	}
	
}
