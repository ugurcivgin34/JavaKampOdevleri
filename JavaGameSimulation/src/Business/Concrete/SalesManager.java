package Business.Concrete;

import Business.Abstract.SalesService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class SalesManager implements SalesService {

	@Override
	public void sales(Game game, User user, Campaign campaign) {
		if (game.getId() > 0) {
			System.out.println(user.getFirstName() + " isimli kullanýcý " + game.getName() + " adlý oyununu "
					+ campaign.getCampaignName() + " Kampayasýndan aldý ");

		}

		else {
			System.out.println("Oyun bulunmamaktadýr.Oyun satýþý yapýlamamaktadýr");
		}

	}

}
