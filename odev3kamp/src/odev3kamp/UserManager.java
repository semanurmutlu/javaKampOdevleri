package odev3kamp;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� Kaydedildi:"+" "+user.getFirstName() +" "+user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi ");
	}
	
	public void input(User user) {
		System.out.println("Kullan�c� Giri� yapt� ");
	}
	
	public void output(User user) {
		System.out.println("Kullan�c� ��k�� yapt� ");
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi ");
	}
	
	
	
	

}
