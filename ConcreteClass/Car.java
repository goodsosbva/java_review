package concreteClass;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("½Ãµ¿ ¿Â!");
	}
	
	public void turnOff() {
		System.out.println("½Ãµ¿ ²û!");
	}
	
	// ÅÆÇÃ¸´ ¸Å¼­µå
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}

}
