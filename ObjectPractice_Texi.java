package first;

public class ObjectPractice_Texi {
	String texiKind;
	int passengerCount;
	int money;
	
	public ObjectPractice_Texi(String texiKind) {
		this.texiKind = texiKind;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("�ý��� ������ " + texiKind + "�̰�, �°���" + passengerCount + "���̰�, ������ " + money);
	}

}
