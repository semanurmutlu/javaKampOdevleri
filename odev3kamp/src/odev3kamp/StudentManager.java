package odev3kamp;

public class StudentManager extends UserManager{
	

	public void add(User[] user) {
		System.out.println("��renci eklendi: ");
	}
	
	public void delete(User user) {
		System.out.println("��renci silindi: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("��renci g�ncellendi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void input(User user) {
		System.out.println("��renci giri� yapt�: "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void output(User user) {
		System.out.println("��renci ��k�� yapt�: "+user.getFirstName()+" "+user.getLastName());
	}

}
