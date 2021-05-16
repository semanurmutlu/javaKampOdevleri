package odevKamp4.abstracts;

import java.rmi.RemoteException;

import odevKamp4.entities.Customer;

public interface ICustomerCheckService {
	

	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
	
}
