package odev3kamp;

public class Student extends User{
	
	private String studentTc;
	
	
	public Student(String studentTc,int id,String firstName,String lastName,int age,String email,String course,String password){
		super(id,firstName,lastName,age,email,course,password);
		this.studentTc=studentTc;
	}


	public String getStudentTc() {
		return studentTc;
	}


	public void setStudentTc(String studentTc) {
		this.studentTc = studentTc;
	}


	
	

}
