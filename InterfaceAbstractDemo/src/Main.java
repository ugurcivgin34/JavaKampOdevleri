
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		//BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(1,"Uður Okan","Çivgin",new Date(1994,2,1),"111111111111");
		
		baseCustomerManager.save(customer);
	}

}
