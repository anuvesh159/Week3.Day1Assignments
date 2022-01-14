package wee3.day1;

public class Student {

	public void getStudentInfo(int id) {
		System.out.println("The Student ID is :"+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student ID is :"+id);
		System.out.println("The Name of the Student is :"+name);
		}
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("The Email of the Student is :"+email);
		System.out.println("The Phonenumber of the Student is :"+phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Student info = new Student();
		info.getStudentInfo(142451);
		info.getStudentInfo(2113326, "Aniveshu");
		info.getStudentInfo("anuvesh159@gmail.com", "8610220898");
		
	}
}


