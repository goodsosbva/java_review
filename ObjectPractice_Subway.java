package first;

public class ObjectPractice_Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public ObjectPractice_Subway (String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}