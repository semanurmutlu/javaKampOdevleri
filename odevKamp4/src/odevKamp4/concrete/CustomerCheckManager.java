package odevKamp4.concrete;

import java.rmi.RemoteException;

import odevKamp4.abstracts.ICustomerCheckService;
import odevKamp4.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{
	

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException{
		
		return true;
	}

}
