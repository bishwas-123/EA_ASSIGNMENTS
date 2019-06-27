package edu.mum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;


@Entity
  public class User implements Serializable  {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(nullable = false)
    private Long id = null;

	@Column(nullable = false)
     private String firstName;

	@Column(nullable = false)
     private String lastName;

     private String email;
	@Column(nullable = false)
     private int rating = 0;

	@Column(nullable = false)
     private boolean admin = false;
     
     @Version
	 @Column(nullable = false)
     private int version = 0;

     private Date lastLogin;
     
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	//constructors

	public User(String firstName, String lastName,String email, boolean admin, Date lastLogin){
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.admin=admin;
		this.lastLogin=lastLogin;

	}

	public User(){

	}

}