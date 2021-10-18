package basicClass;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();  	//Ŭ���� Ŭ������ �������� ����� ũ�� 3������ �ִµ� ���ݹ���ó�� �ν��Ͻ��� ������,
		
		Class pClass1 = person.getClass();  //getClass �� Person�� ����. �׷� ������?
											//object�ǰŰ� ��� Ŭ������ object�� ����� �ް�,
											//Person�� object�� Ŭ������ �� �� ���� .getClass�� object�� �ż���.  getClass�� �̿��ؼ� 
											//Ŭ���� Class �ż��带 ������ �� �ִ�.
		
		System.out.println(pClass1.getName());  //Ŭ������ �̸��� ������.
		
		Class pClass2 = Person.class;  //2��° ���
		System.out.println(pClass2.getName());  //2������ ����� ������ Ÿ���� �˰��־�� ��. (static �ε�)
		
		Class pClass3 = Class.forName("java.lang.String"); //�Ű������� Ŭ������ �������� �����ε� ��� (������ �������� ���)
		System.out.println(pClass3.getName());
		
		Person p = new Person(); 
		
		System.out.println(p);
		

	}

}
