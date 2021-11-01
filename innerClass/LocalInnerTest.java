package innerClass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable() {
		
		int localNum = 100;
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//localNum += 10; ���� ���� p.457 ���� ���� ������ ���ÿ��� �����. ��� ó����.
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		// Runnable runner = out.getRunnable(10);
		outer.getRunnable().run();

	}

}
