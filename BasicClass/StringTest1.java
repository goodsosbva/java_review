package basicClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		String str3 = new String("java");
		String str4 = new String("android");
		
		System.out.println(System.identityHashCode(str3));
		str3 = str3.concat(str4); //str3 �� str4�� �پ��ٰ� ������ �� ������, �ǻ��� �׷��� �ʴ�. str3�� ���� ������ ���ڿ�����Ű�°��� �����Ȱ�.
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(str3);
		
		System.out.println(str1 == str2); //Ŭ������ �Ű������� ���ڿ��� �����ϸ�  �ٸ� �޸𸮿� �����
		
		String str5 = "abc";
		String str6 = "abc";
		
		System.out.println(str3 == str4); // ���ڿ� ����� ����Ű�� ����� ���� �޸𸮿� �ּҸ� ����Ű�� �����.

	}

}
