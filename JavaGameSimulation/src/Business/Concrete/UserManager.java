package Business.Concrete;

import Business.Abstract.CheckIfRealPerson;
import Business.Abstract.UserService;
import Entities.Concrete.User;

public class UserManager implements UserService{

	CheckIfRealPerson checkIfRealPerson;
	
	public UserManager(CheckIfRealPerson checkIfRealPerson) {
		this.checkIfRealPerson=checkIfRealPerson;
	}
	@Override
	public void add(User user) throws Exception {
		if(checkIfRealPerson.checkIfRealPerson(user)) {
		System.out.println(" Kullanýcý eklendi " + user.getFirstName());
		} else {
			System.out.println("Kullanýcý E devlet sisteminde olmadýðý için eklenemez");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi" + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi" + user.getFirstName());
		
	}

}
