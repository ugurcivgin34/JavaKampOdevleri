package Business.Concrete;

import Business.Abstract.CheckIfRealPerson;
import Entities.Concrete.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckIfRealPersonManager implements CheckIfRealPerson {

	@Override
	public boolean checkIfRealPerson(User user) throws Exception {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		System.out.println("Doðrulama yapýlýyor");
		
		return client.TCKimlikNoDogrula(Long.parseLong(user.getIdentificationNumber()), user.getFirstName(),
				user.getLastName(), user.getYearOfBirth().getYear());
	}

}
