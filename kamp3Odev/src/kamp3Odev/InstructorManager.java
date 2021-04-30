package kamp3Odev;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("Eðitmen eklendi " + user.getFirstName() + " " + user.getLastName());
	}

	public void delete(User user) {
		System.out.println("Eðitmen silindi");
	}

	public void update(User user) {
		System.out.println("Eðitmen güncellendi");
	}

	public void logIn(User user) {
		System.out.println("Eðitmen giriþ yaptý");
	}

	public void logOut(User user) {
		System.out.println("Eðitmen çýkýþ yaptý");
	}
}
