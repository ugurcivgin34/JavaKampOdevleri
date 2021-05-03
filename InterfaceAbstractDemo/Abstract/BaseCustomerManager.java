
public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db :" + customer.getFirstName());

	}

	// save kodlarý ayný olduðundan çalýþacak kodlar ayný ama öncesinde yapýlacak
	// iþler farklý, interfacelerde kod çalýþtýramýyoruz sadece imza. Ama base
	// abstract classda base olarak çalýþacak ayný kodlarý "Dont Repeat Yourself"
	// kuralýna da uyarak gayet güzel çalýþtýrabiliyoruz. Yani tüm kahveciler için
	// managerlarda dbye kaydetme kodlarý yazmak yerine base managerda yazýp tüm
	// kahveciler için base managerdaki methodu çaðrýnca tek bir yerden yönetmiþ
	// olduk.

}
