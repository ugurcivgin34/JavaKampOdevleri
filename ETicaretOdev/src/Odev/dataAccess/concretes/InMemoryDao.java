package Odev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Odev.dataAccess.abstracts.UserDao;
import Odev.entitites.concretes.User;

public class InMemoryDao implements UserDao {

	ArrayList<User> users =new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);

	}

	@Override
	public ArrayList<User> getAll() {
		return users;

	}

	@Override
	public User getEmail(String email) {
		for (User user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
	public User getPassword(String password) {
		for (User user : users) {
			if(user.getEmail().equals(password)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User login(String email, String password) {
		for (User user : users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
