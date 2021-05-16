package odevKamp4;

import java.time.LocalDate;

import odevKamp4.abstracts.BaseCustomerManager;
import odevKamp4.adapters.MernisServiceAdapter;
import odevKamp4.concrete.StarbucksCustomerManager;
import odevKamp4.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter()); 
        customerManager.save(new Customer(1, "Semanur", "mutlu",LocalDate.of(1995,1,24), "48644484657"));

	}

}
