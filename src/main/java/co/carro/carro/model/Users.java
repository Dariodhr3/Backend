package co.carro.carro.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Access(AccessType.FIELD)
@Table(name="users")
public class Users implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_id")
	@Id
	@Column(name="id", unique=true, nullable=false)
	private long id;

	@Column(name="first_name",nullable=false, length=20)
private String	firstName; 
	
	@Column(name="second_name",nullable=true, length=20)
private String	secondName;
	
	@Column(name="first_surname",nullable=false, length=20)
private String	firstSurname;
	
	@Column(name="second_surname",nullable=true, length=20)
private String	secondSurname; 
	
	@Column(name="phone",nullable=true, length=10)
private String	phone;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="address",nullable=false, length=20)
private String	address; 

	
}
