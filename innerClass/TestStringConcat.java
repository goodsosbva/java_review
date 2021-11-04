package innerClass;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		// 매서드 테스트
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		
		// 람다식
		StringConcat concat2 = (s, v) -> System.out.println(s+ "," + v);
		concat2.makeString(s1, s2);
	}

}
