package first;

public class ObjectPractice_student {
	public String studentName;
	public int grade;
	public int money;
	
	public ObjectPractice_student (String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(ObjectPractice_Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		
	}
	
	public void takeSubway(ObjectPractice_Subway subway) {
		subway.take(1500);
		this.money -= 1500;
		
	}
	
	public void takeTexi(ObjectPractice_Texi texi) {
		texi.take(10000);
		this.money -= 10000;
		
	}
	
	public void showInfo() {
		System.out.println(studentName + "¥‘¿Ã πﬁ¿ª µ∑¿∫" + money);
	}
}


