package odevKamp4.concrete;
import odevKamp4.abstracts.BaseCustomerManager;
import odevKamp4.abstracts.ICustomerCheckService;
import odevKamp4.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
     ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {

		this.customerCheckService=customerCheckService;
	}
	
	public void save(Customer customer) throws Exception{
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			throw new Exception("Not a valid person");
		}
	}
	
	

	

}
