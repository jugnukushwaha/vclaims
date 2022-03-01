package com.app.vclaims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
//	@SequenceGenerator(name="sequenceGenerator", initialValue = 110)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_id")
	private int userid;
	@Column(name = "First_name")
	private String firstname;
	@Column(name = "Last_name")
	private String lastname;
	@Column(name = "Email")
	private String email;
	@Column(name = "Mobile_no")
	private long contact;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "Password")
	private String password;

	public User() {
		super();
	}

	public User(int userid, String firstname, String lastname, String email, long contact, String gender, String dob,
			String password) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.password = password;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", contact=" + contact + ", gender=" + gender + ", dob=" + dob + ", password=" + password + "]";
	}

}
