package collectionFramework;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("������");
		tree.add("�弱��");
		tree.add("�����");
		tree.add("����");
		
		System.out.println(tree); //������ �Ǽ� ������ ���� ->String������ compare�� ������ �Ǿ��ֱ� ������ ����x

	}

}
