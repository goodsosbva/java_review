package collectionFramework;

import collectionFramework.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberkwon = new Member(102, "������");
		Member memberson = new Member(103, "�����");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberkwon);
		memberHashSet.addMember(memberson);
		
		memberHashSet.showAll();
		
		Member memberson2 = new Member(104, "������");  
		Member memberson3 = new Member(102, "���°�"); // ���̵� �ߺ� �߰�
		memberHashSet.addMember(memberson2);
		memberHashSet.showAll();

	}

}
