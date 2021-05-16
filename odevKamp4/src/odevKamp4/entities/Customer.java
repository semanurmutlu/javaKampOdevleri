package odevKamp4.entities;

import odevKamp4.abstracts.IEntity;
import java.time.LocalDate;

public class Customer implements IEntity{

	private int id;
	private String firsNname;
	private String lastName;
	private LocalDate dateOfBirth;
	private String NationalityId;
	
	public Customer() {
		
	}

	public Customer(int id, String firsNname, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firsNname = firsNname;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsNname() {
		return firsNname;
	}

	public void setFirsNname(String firsNname) {
		this.firsNname = firsNname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}

