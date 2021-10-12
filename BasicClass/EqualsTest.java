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
		
		Student studentkwon = new Student(100, "������");
		Student studentkwon2 = studentkwon;
		Student studentjang = new Student(100, "������");
		// ������ �ּ��� �� �ν��Ͻ� ��
		if(studentkwon == studentkwon2)
			System.out.println("studentkwon�� studentkwon2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentkwon�� studentkwon2�� �ּҴ� �ٸ��ϴ�.");
		if(studentkwon.equals(studentkwon2))
			System.out.println("studentkwon�� sstudentkwon2�� �����մϴ�.");
		else
			System.out.println("studentkwon�� studentkwon2�� �������� �ʽ��ϴ�.");
		
		//�ּҴ� �ٸ����� equals �� ����� true �� ���
		if(studentkwon == studentjang)
			System.out.println("studentkwon�� studentjang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentkwon�� studentjang�� �ּҴ� �ٸ��ϴ�.");
		if(studentkwon.equals(studentjang))
			System.out.println("studentkwon�� studentjang�� �����մϴ�.");
		else
			System.out.println("studentkwon�� studentjang�� �������� �ʽ��ϴ�.");

		System.out.println("studentkwon�� hashCode :" +studentkwon.hashCode());
		System.out.println("studentSang�� hashCode :" +studentjang.hashCode());
		
		System.out.println("studentkwon�� ���� �ּҰ� :"+ System.identityHashCode(studentkwon));
		System.out.println("studentSang�� ���� �ּҰ� :"+ System.identityHashCode(studentjang));

	}

}
