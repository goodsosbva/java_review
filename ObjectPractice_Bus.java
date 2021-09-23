package first;

public class ObjectPractice_Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public ObjectPractice_Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("bus" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money);
	}

}
