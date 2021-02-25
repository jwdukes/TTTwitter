package com.tts.TTTwitter.model;

import java.util.Date;

import javax.management.relation.Role;
import javax.persistence.JoinColumn;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GernationType.AUTO)
	private Long id;
	private String email;
	private String username;
	private String firstName;
	private String lastName;
	private int active;
	
	@CreationTimestamp
	private Date createdAt;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private set<Role> roles;
	

	
	
	public User() {}

	public User(String email, String username, String firstName, String lastName, int active) {
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", active=" + active + "]";
	}
	
	
	
	
}

