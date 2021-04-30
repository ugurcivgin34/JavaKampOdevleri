package kamp3Odev;

public class User {
	private int id;
	private String email;
	private String country;
	private String city;
	private String contact;
	private String password;
	private String firstName;
	private String lastName;
	private String course;

	public User() {

	}

	public User(int id, String email, String country, String city, String contact, String password, String firstName,
			String lastName, String course) {
		this();
		this.id = id;
		this.email = email;
		this.country = country;
		this.city = city;
		this.contact = contact;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
