package odev3kamp;

public class InstructorManager extends UserManager{
	
	public void add(User user) {
		System.out.println("E�itmen eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void input(User user) {
		System.out.println("E�itmen eklendi: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void output(User user) {
		System.out.println("E�itmen silindi: "+user.getFirstName()+" "+user.getLastName());
	}
	

}
