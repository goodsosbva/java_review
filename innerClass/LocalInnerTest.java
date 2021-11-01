package innerClass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable() {
		
		int localNum = 100;
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//localNum += 10; 오루 설명 p.457 참조 지역 변수는 스택에서 저장됨. 상수 처리됨.
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
