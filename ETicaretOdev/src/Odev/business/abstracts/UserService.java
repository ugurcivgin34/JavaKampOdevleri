package Odev.business.abstracts;


import java.util.List;

import Odev.entitites.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	List<User> getAll();
}
