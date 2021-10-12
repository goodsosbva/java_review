package basicClass;


class Student{
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString(){
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student std = (Student)obj;
			if( studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentkwon = new Student(100, "권현성");
		Student studentkwon2 = studentkwon;
		Student studentjang = new Student(100, "권현성");
		// 동일한 주소의 두 인스턴스 비교
		if(studentkwon == studentkwon2)
			System.out.println("studentkwon와 studentkwon2의 주소는 같습니다.");
		else
			System.out.println("studentkwon와 studentkwon2의 주소는 다릅니다.");
		if(studentkwon.equals(studentkwon2))
			System.out.println("studentkwon와 sstudentkwon2는 동일합니다.");
		else
			System.out.println("studentkwon와 studentkwon2는 동일하지 않습니다.");
		
		//주소는 다르지만 equals 의 결과가 true 인 경우
		if(studentkwon == studentjang)
			System.out.println("studentkwon와 studentjang의 주소는 같습니다.");
		else
			System.out.println("studentkwon와 studentjang의 주소는 다릅니다.");
		if(studentkwon.equals(studentjang))
			System.out.println("studentkwon와 studentjang은 동일합니다.");
		else
			System.out.println("studentkwon와 studentjang은 동일하지 않습니다.");

		System.out.println("studentkwon의 hashCode :" +studentkwon.hashCode());
		System.out.println("studentSang의 hashCode :" +studentjang.hashCode());
		
		System.out.println("studentkwon의 실제 주소값 :"+ System.identityHashCode(studentkwon));
		System.out.println("studentSang의 실제 주소값 :"+ System.identityHashCode(studentjang));

	}

}
