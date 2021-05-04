package UI;

import java.util.Date;

import Business.Concrete.CheckIfRealPersonManager;
import Business.Concrete.SalesManager;
import Business.Concrete.UserManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) throws Exception {
		User user = new User(1,"Uður Okan","Çivgin","11111111111",new Date(1994,2,1),"Öðrenci");
		Game game=new Game(1,"GTAV",1500,10);
		Campaign  campaign =new Campaign(1,"Öðrenci",150);
		SalesManager salesManager=new SalesManager();
		
		UserManager userManager=new UserManager(new CheckIfRealPersonManager());
		userManager.add(user);
		
		salesManager.sales(game, user, campaign);

	}

}
