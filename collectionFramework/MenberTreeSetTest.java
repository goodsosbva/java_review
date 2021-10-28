package collectionFramework;

import collectionFramework.Member;

public class MenberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet =new MemberTreeSet();
		
		Member memberLee = new Member(101, "�㼮");
		Member memberkwon = new Member(102, "������");
		Member memberson = new Member(103, "�����");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberkwon);
		memberTreeSet.addMember(memberson);
		
		memberTreeSet.showAll();
		
		Member memberson2 = new Member(103, "�տ���");  // class collection.Member cannot be cast to class java.lang.Comparable
		memberTreeSet.addMember(memberson2);		  //��� ���ؼ� ������ ������ �ȵǾ���.
		
		memberTreeSet.showAll();

	}

}
