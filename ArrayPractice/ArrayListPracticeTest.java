package first.ArrayPractice;

public class ArrayListPracticeTest {

	public static void main(String[] args) {
		ArrayListPracticeStudent studentkwon = new ArrayListPracticeStudent(1001, "kwon");
		studentkwon.addSubject("����", 75);
		studentkwon.addSubject("����", 95);
		studentkwon.addSubject("����", 80);
		
		ArrayListPracticeStudent studentson = new ArrayListPracticeStudent(1002, "son");
		studentson.addSubject("����", 70);
		studentson.addSubject("����", 85);
		studentson.addSubject("����", 100);
		
		studentkwon.showStudentInfo();
		System.out.println("======================================");
		studentson.showStudentInfo();

	}

}
