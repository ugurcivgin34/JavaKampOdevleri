package Business.Abstract;

import Entities.Concrete.User;

public interface CheckIfRealPerson {
	boolean checkIfRealPerson(User user) throws Exception;

}
