package odev3kamp;

public class InstructorManager extends UserManager{
	
	public void add(User user) {
		System.out.println("Eðitmen eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void input(User user) {
		System.out.println("Eðitmen eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void output(User user) {
		System.out.println("Eðitmen silindi: "+user.getFirstName()+" "+user.getLastName());
	}
	

}
