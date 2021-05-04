
package Entities.Concrete;

import java.util.Date;

import Entities.Abstract.Entity;

public class User implements Entity  {
	private int id;
	private String firstName;
	private String lastName;
	private String identificationNumber;
	private Date yearOfBirth;
	private String type;

	public User() {

	}

	public User(int id, String firstName, String lastName, String identificationNumber, Date yearOfBirth, String type) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.yearOfBirth = yearOfBirth;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public Date getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Date yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
