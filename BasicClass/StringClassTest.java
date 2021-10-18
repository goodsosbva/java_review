package basicClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
		
		for(Method m : methods) {
			System.out.println(m);         //strClass 로 존재하는 매서드 필드 생성자를 가져와볼수 있음
		}	

	}

}
