package Odev.core.Adapter;

import Odev.GoogleHesap.GoogleManager;
import Odev.entitites.concretes.User;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void registerToGoole(String message) {
		GoogleManager googleManager=new GoogleManager();
		googleManager.register("Sisteme google ile kayýt olundu");
		
	}

	

	
	}


