package innerClass;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		// �ż��� �׽�Ʈ
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		
		// ���ٽ�
		StringConcat concat2 = (s, v) -> System.out.println(s+ "," + v);
		concat2.makeString(s1, s2);
	}

}
