package first.ArrayPractice;
import java.util.ArrayList;

public class ArrayListPracticeStudent {
	
	int studentID;
	String studentName;
	ArrayList<ArrayListPracticeSubject> subjectList;
	int index;
	
	public ArrayListPracticeStudent(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<ArrayListPracticeSubject>();
	}
	
	public void addSubject(String name, int score){
		ArrayListPracticeSubject subject = new ArrayListPracticeSubject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo()
	{
		int total = 0;
		
		for(ArrayListPracticeSubject s : subjectList){
			
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
			        s.getScorePoint() + "입니다.");
		}
			
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}

}
