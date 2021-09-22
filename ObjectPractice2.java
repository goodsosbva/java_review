package first;

public class ObjectPractice2 {
	int age;
	String name;
	String marry;
	int child;

	public static void main(String[] args) {
		ObjectPractice2 family = new ObjectPractice2();
		
		family.age = 29;
		family.name = "권현성";
		family.marry = "안함";
		family.child = 0;
		
		System.out.println("나이가 "+family.age+"살,"+ "이름이 "+family.name+"라는 남자는 결혼은 " + family.marry + " 자식은 " + family.child+"명.");

	}

}
