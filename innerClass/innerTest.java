package innerClass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;            //�ν��Ͻ� �̳� Ŭ���� �϶�
	
	public OutClass() {
		inClass = new InClass();
	}
	class InClass{  // �ν��Ͻ� ���� Ŭ����
		int inNum = 200;  //���� Ŭ������ �ν��Ͻ� ����
		//static sInNum = 100; �ν��Ͻ� ���� Ŭ���������� ����ƽ ������ ����� �� ����.
		
		void inTest() {
			System.out.println(num + "�ܺ� Ŭ������ �ν��Ͻ� ����");
			System.out.println(sNum + "�ܺ� Ŭ������ ���� ����");
		}
		
	/*	static void sTest() {
	} ����ƽ �ż��� ���� ����� �� ����.*/
		public void usingInTest() {
			inClass.inTest();
		}
 }
	public void usingClass() {
		inClass.inTest();
	}
	//outclass�� �������� ������� �����ؼ� �� �� �ִ� ���C�̴�. ( ���� ���� Ŭ���� )
	static class InStaticClass{
		int iNum = 100;  // ���� ���� Ŭ���� �ν��Ͻ� ����
		static int sInNum = 200;  // ���� ���� Ŭ���� ���� ����
		void inTest() {
			//num += 10; �ܺ�Ŭ������ ������ ������� �� ���� �����Ƿ� �翬�� �ܺ�Ŭ������ ������ ��� �� �� ����.
			sNum += 10; //�ܺ�Ŭ������ ���� ������ �翬�� �� �� �ִ�.
			System.out.println(sNum + "���� Ŭ������ �ν��Ͻ� ����");
			System.out.println(iNum + " ���� Ŭ������ ���� ����");  //�ְ� �����ȴ������� �ν��Ͻ����� Ŭ������ �����Ǵϱ� �� �� �ְ�
			System.out.println(sInNum + "�ܺ� Ŭ������ ���� ����"); //��������Ŭ������ ���������ϱ� �� �� �ִ�.
			
		}
	//static void sTest() {
		//System.out.println(sNum);
		// System.out.println(iNum);   "static class InStaticClass" ������ ������� �� �� ����. ��� ����
		//System.out.println(sInNum);
		
	//}
	
		
	}
}


public class innerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		// outClass.inClass.inTest();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();
		OutClass.InClass inClass = outClass.new InClass(); //OutClass�� �����Ǿ� �ִ� �������� ����� �� �ִ�.
		// inClass.inTest();
		
		System.out.println();	
		
		//������ ���� InClass�� prvate�� ���� �����ű� ������ , �ٸ� ������� ���� �ؾ� �Ѵ�.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //�ƿ�Ŭ������ ������ ������� �� �� �ִ�
		System.out.println("���� ���� Ŭ���� �Ϲ� �ż��� ȣ��");		
		sInClass.inTest(); //�� ������ ������ ������� ���� �� �� ����. �׷��Ƿ� �׾ȿ� �� �� �ִ� �������� ��� ���� ������.
	}

}
