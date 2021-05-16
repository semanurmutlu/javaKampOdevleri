package odevKamp4.adapters;

import java.rmi.RemoteException;

import odevKamp4.abstracts.ICustomerCheckService;
import odevKamp4.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirsNname().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
	}

}
