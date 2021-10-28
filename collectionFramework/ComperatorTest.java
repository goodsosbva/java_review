package collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * -1;
	}
	
	
}

public class ComperatorTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>(new MyCompare());  //new MyCopare() 넣으면 compare을 쓰겠다는 의미
		tree.add("aaa");
		tree.add("bbb");
		tree.add("ccc");
		
		System.out.println(tree);

	}

}
