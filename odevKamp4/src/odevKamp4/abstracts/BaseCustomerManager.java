package odevKamp4.abstracts;

import odevKamp4.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		
		System.out.println("Validation successful.Customer saved to database: "+ customer.getFirsNname()+" "+ customer.getLastName());
		
	}

}
