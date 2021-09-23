package first.ArrayPractice;

public class ArrayListPracticeTest {

	public static void main(String[] args) {
		ArrayListPracticeStudent studentkwon = new ArrayListPracticeStudent(1001, "kwon");
		studentkwon.addSubject("국어", 75);
		studentkwon.addSubject("수학", 95);
		studentkwon.addSubject("영어", 80);
		
		ArrayListPracticeStudent studentson = new ArrayListPracticeStudent(1002, "son");
		studentson.addSubject("국어", 70);
		studentson.addSubject("수학", 85);
		studentson.addSubject("영어", 100);
		
		studentkwon.showStudentInfo();
		System.out.println("======================================");
		studentson.showStudentInfo();

	}

}
