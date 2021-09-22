package first;

public class ObjectPractice {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	



	public static void main(String[] args) {
		ObjectPractice kwon = new ObjectPractice();
		kwon.studentName ="±ÇÇö¼º";
		
		System.out.println(kwon.studentName);
		System.out.println(kwon.getStudentName());
		
		
		

	}

}
