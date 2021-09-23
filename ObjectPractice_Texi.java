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
		System.out.println("택시의 종류는 " + texiKind + "이고, 승객은" + passengerCount + "명이고, 수입은 " + money);
	}

}
