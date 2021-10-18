package basicClass;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();  	//클래스 클래스를 가져오는 방법은 크게 3가지가 있는데 지금문장처럼 인스턴스가 있으면,
		
		Class pClass1 = person.getClass();  //getClass 는 Person에 없음. 그럼 누구거?
											//object의거고 모든 클래스는 object의 상속을 받고,
											//Person은 object의 클래스를 쓸 수 있음 .getClass는 object의 매서드.  getClass를 이용해서 
											//클래스 Class 매서드를 가져올 수 있다.
		
		System.out.println(pClass1.getName());  //클래스의 이름을 가져옴.
		
		Class pClass2 = Person.class;  //2번째 방법
		System.out.println(pClass2.getName());  //2가지의 방법은 변수의 타입을 알고있어야 됨. (static 로딩)
		
		Class pClass3 = Class.forName("java.lang.String"); //매개변수로 클래스를 가져오는 동적로딩 방식 (있으면 가져오는 방식)
		System.out.println(pClass3.getName());
		
		Person p = new Person(); 
		
		System.out.println(p);
		

	}

}
