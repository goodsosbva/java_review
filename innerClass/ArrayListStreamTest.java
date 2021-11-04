package innerClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("kwon");
		sList.add("son");
		sList.add("one");
		sList.add("Lee");
		
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		
		sList.stream().sorted().forEach(s->System.out.print(s + " "));
	}

}
