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
		str3 = str3.concat(str4); //str3 과 str4가 붙었다고 생각할 수 있지만, 실상은 그렇지 않다. str3가 새로 생성된 문자열가리키는것이 생성된것.
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(str3);
		
		System.out.println(str1 == str2); //클래스의 매개변수로 문자열을 생성하면  다른 메모리에 저장됨
		
		String str5 = "abc";
		String str6 = "abc";
		
		System.out.println(str3 == str4); // 문자열 상수로 가리키는 방식은 같은 메모리에 주소를 가리키는 방식임.

	}

}
