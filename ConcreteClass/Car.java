package concreteClass;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ� ��!");
	}
	
	public void turnOff() {
		System.out.println("�õ� ��!");
	}
	
	// ���ø� �ż���
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}

}
