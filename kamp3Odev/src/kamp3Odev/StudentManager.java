package kamp3Odev;

public class StudentManager extends UserManager {
	public void add(User[] user) {
		System.out.println("Öðrenci eklendi " );
	}

	public void delete(User user) {
		System.out.println("Öðrenci silindi");
	}

	public void update(User user) {
		System.out.println("Öðrenci güncellendi");
	}

	public void logIn(User user) {
		System.out.println("Öðrenci giriþ yaptý");
	}

	public void logOut(User user) {
		System.out.println("Öðrenci çýkýþ yaptý");
	}
}
