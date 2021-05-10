package odev3kamp;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanýcý Kaydedildi:"+" "+user.getFirstName() +" "+user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi ");
	}
	
	public void input(User user) {
		System.out.println("Kullanýcý Giriþ yaptý ");
	}
	
	public void output(User user) {
		System.out.println("Kullanýcý çýkýþ yaptý ");
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi ");
	}
	
	
	
	

}
