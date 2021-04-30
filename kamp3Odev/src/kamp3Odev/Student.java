package kamp3Odev;

public class Student extends User {
	private String studentNumber;

	

	public Student(String studentNumber,int id, String email, String country, String city, String contact, String password, String firstName,
			String lastName, String course) {
		super(id,email,country,city,contact,password,firstName,lastName,course);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
