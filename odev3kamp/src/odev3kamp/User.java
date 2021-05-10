package odev3kamp;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String course;
	private String password;
	
	public User() {
		
	}
	
	public User(int id,String firstName,String lastName,int age,String email,String course,String password) {

		this();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.email=email;
		this.course=course;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
