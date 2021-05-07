package Odev;

import java.util.ArrayList;

import Odev.business.concretes.UserManager;
import Odev.core.Adapter.GoogleAuthManagerAdapter;
import Odev.core.utils.EmailCheckUtils;

import Odev.dataAccess.concretes.InMemoryDao;
import Odev.entitites.concretes.User;

public class Main {

	public static void main(String[] args) {

//		EmailCheckUtils checkUtils=new EmailCheckUtils();
//		System.out.println(checkUtils.isEmailValid("u.civgin@gmail.com"));   
//
		User user1 = new User(1, "Uður", "Çivgin", "u.civgin@gmail.com", "134456");
		User user2 = new User(2, "sait", "Çivgin", "u.civgin@gmjail.com", "144356");

		User user3 = new User(3, "Þahin", "Çivgin", "u.civgin@gmjail.com", "144356");
		User user4 = new User(3, "Þahin", "Çivgin", "u.civgasdin@gmjail.com", "144123356");
////	
		UserManager userManager = new UserManager(new InMemoryDao(), new GoogleAuthManagerAdapter());
//			
//			
//		
		userManager.register(user1);
		userManager.register(user2);

//		
		userManager.login(user4);
//		

//	

	}

}
