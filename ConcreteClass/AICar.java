package concreteClass;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�");
	}
	
	@Override
	public void wiper() {
		// System.out.println("���� �����մϴ�");
		System.out.println("�� ���� �翡 ���� �����۰� �۵��˴ϴ�");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

}
