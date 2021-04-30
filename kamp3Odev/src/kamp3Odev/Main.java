package kamp3Odev;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setCertificate("C#");
		instructor.setCity("Ýstanbul");
		instructor.setContact("05323235323");
		instructor.setCountry("Türkiye");
		instructor.setCourse("C#");
		instructor.setEmail("asdeas@gmail.com");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setPassword("123");

		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setCertificate("Java");
		instructor2.setCity("Ýstanbul");
		instructor2.setContact("11111");
		instructor2.setCountry("Amerika");
		instructor2.setCourse("Java");
		instructor2.setEmail("123123@gmail.com");
		instructor2.setFirstName("Okan");
		instructor2.setLastName("Çivgin");
		instructor2.setPassword("123");
		
		
		Student student = new Student("123", 1, "qwweq@gmail.com", "Türkiye", "Ýstanbul", "053111", "123", "Uður Okan", "Çivgin", "Java");
		Student student2 = new Student("2134", 2, "qwweq@gmail.com", "Türkiye", "Ýstanbul", "053111", "123", "Sait", "Çivgin", "Java");
		
		Student[] students= {student,student2};
		

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(students);
		
		System.out.println(student.getFirstName() + " " + student.getLastName());
		System.out.println(student2.getFirstName() + " " + student2.getLastName());
		

		

	}

}
