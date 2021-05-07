package Odev.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import Odev.entitites.concretes.User;

public interface UserDao {
	void add(User user);
	User getEmail(String email);
	User getPassword(String password);
	ArrayList<User> getAll();
	User login(String email,String password);
	
}
