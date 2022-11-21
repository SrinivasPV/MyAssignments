package week3.day1.assignment;

public class Students {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub

		System.out.println(id);
	}
	
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub

		System.out.println(name+ " : " + id);
	}
	
	public void getStudentInfo(String email, int ph ) {
		// TODO Auto-generated method stub

		System.out.println(email);
		System.out.println(ph);
		
	}
	
	public static void main(String[] args) {
		
		Students st = new Students();
		st.getStudentInfo(123);
		st.getStudentInfo(345, "Srini");
		st.getStudentInfo("xyz@gmail.com", 12345);
	}

}
