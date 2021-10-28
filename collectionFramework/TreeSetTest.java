package collectionFramework;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("권현성");
		tree.add("장선영");
		tree.add("김고은");
		tree.add("세진");
		
		System.out.println(tree); //정렬이 되서 나오는 이유 ->String에서는 compare이 구현이 되어있기 때문에 오류x

	}

}
