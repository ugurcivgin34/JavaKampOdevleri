package kamp3Odev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi " + user.getFirstName() + " "+user.getLastName());
	}

	public void delete(User user) {
		System.out.println("Kullanýcý silindi");
	}

	public void update(User user) {
		System.out.println("Kullanýcý güncellendi");
	}

	public void logIn(User user) {
		System.out.println("Kullanýcý giriþ yaptý");
	}

	public void logOut(User user) {
		System.out.println("Kullanýcý çýkýþ yaptý");
	}
}
