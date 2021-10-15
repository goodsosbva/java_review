package basicClass;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public String toString() {
		return "x= " + x + " , " + " y= " + y;
	}
}

class Circle implements Cloneable{   //클론을 생성해도 된다고 implements Cloneable로 명시 (마크 인터페이스)
 	
	Point point;
	private int radius;
	
	public Circle(int x, int y , int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	public String toString() {
		return "원점은 " + point + " 이고, 반지름은 " + radius + " 입니다";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectCloneTest {
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10 ,20 ,50);
		Circle cloneCircle = (Circle)circle.clone();  //강제 다운 캐스팅 
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));  //이대로 하면 클론이 생성안됨 클론을 생성할 클래스에 clone을 만들어도 된다는 것을 명시 해주어야 함.
		
		System.out.println(circle);
		System.out.println(cloneCircle);

	}

}
