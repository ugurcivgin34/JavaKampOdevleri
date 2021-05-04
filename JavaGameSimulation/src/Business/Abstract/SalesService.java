package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public interface SalesService {
	void sales(Game game , User user,Campaign campaign);
}
