package interfaceAbstractDemo;

public class StarbucsCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucsCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		
	}

}
