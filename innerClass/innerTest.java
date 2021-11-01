package innerClass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;            //인스턴스 이너 클래스 일때
	
	public OutClass() {
		inClass = new InClass();
	}
	class InClass{  // 인스턴스 내부 클래스
		int inNum = 200;  //내부 클래스의 인스턴스 변수
		//static sInNum = 100; 인스턴스 내부 클래스에서는 스태틱 변수를 사용할 수 없다.
		
		void inTest() {
			System.out.println(num + "외부 클래스의 인스턴스 변수");
			System.out.println(sNum + "외부 클래스의 정적 변수");
		}
		
	/*	static void sTest() {
	} 스태틱 매서드 또한 사용할 수 없다.*/
		public void usingInTest() {
			inClass.inTest();
		}
 }
	public void usingClass() {
		inClass.inTest();
	}
	//outclass의 생성과는 상관없이 생성해서 쓸 수 있는 녀섴이다. ( 정적 내부 클래스 )
	static class InStaticClass{
		int iNum = 100;  // 정적 내부 클래스 인스턴스 변수
		static int sInNum = 200;  // 정적 내부 클래스 정적 변수
		void inTest() {
			//num += 10; 외부클래스의 생성과 상관없이 쓸 수도 있으므로 당연히 외부클래스의 변수를 사용 할 수 없다.
			sNum += 10; //외부클래스의 정적 변수는 당연히 쓸 수 있다.
			System.out.println(sNum + "내부 클래스의 인스턴스 변수");
			System.out.println(iNum + " 내부 클래스의 정적 변수");  //애가 생성된다음에는 인스턴스내부 클래스가 생성되니까 쓸 수 있고
			System.out.println(sInNum + "외부 클래스의 정적 변수"); //정적내부클래스의 정적변수니까 쓸 수 있다.
			
		}
	//static void sTest() {
		//System.out.println(sNum);
		// System.out.println(iNum);   "static class InStaticClass" 생성의 상관없이 쓸 수 없다. 고로 오류
		//System.out.println(sInNum);
		
	//}
	
		
	}
}


public class innerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		// outClass.inClass.inTest();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		OutClass.InClass inClass = outClass.new InClass(); //OutClass가 생성되어 있는 시점에서 사용할 수 있다.
		// inClass.inTest();
		
		System.out.println();	
		
		//하지만 보통 InClass를 prvate를 막아 놓을거기 때문에 , 다른 사용방법을 숙지 해야 한다.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //아웃클래스의 생성과 상관없이 쓸 수 있다
		System.out.println("정적 내부 클래스 일반 매서드 호출");		
		sInClass.inTest(); //그 무엇에 생성과 상관없이 생성 될 수 있음. 그러므로 그안에 쓸 수 있는 변수들은 모두 정적 변수다.
	}

}
