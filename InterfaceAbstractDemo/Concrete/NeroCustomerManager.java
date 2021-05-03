
public class NeroCustomerManager extends  BaseCustomerManager {
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			//System.out.println("Saved to db :" + customer.getFirstName());
			super.save(customer);
		} else {
			throw new Exception("Not a valid poerson");
		}

	}

}
