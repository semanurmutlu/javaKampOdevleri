package odev3kamp;

public class StudentManager extends UserManager{
	

	public void add(User[] user) {
		System.out.println("Öðrenci eklendi: ");
	}
	
	public void delete(User user) {
		System.out.println("Öðrenci silindi: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Öðrenci güncellendi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void input(User user) {
		System.out.println("Öðrenci giriþ yaptý: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void output(User user) {
		System.out.println("Öðrenci çýkýþ yaptý: "+user.getFirstName()+" "+user.getLastName());
	}

}
