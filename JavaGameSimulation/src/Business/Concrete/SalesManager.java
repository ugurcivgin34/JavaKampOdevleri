package Business.Concrete;

import Business.Abstract.SalesService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class SalesManager implements SalesService {

	@Override
	public void sales(Game game, User user, Campaign campaign) {
		if (game.getId() > 0) {
			System.out.println(user.getFirstName() + " isimli kullanıcı " + game.getName() + " adlı oyununu "
					+ campaign.getCampaignName() + " Kampayasından aldı ");

		}

		else {
			System.out.println("Oyun bulunmamaktadır.Oyun satışı yapılamamaktadır");
		}

	}

}
