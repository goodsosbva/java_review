package collectionFramework;

import collectionFramework.Member;

public class MenberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet =new MemberTreeSet();
		
		Member memberLee = new Member(101, "허석");
		Member memberkwon = new Member(102, "권현성");
		Member memberson = new Member(103, "손흥민");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberkwon);
		memberTreeSet.addMember(memberson);
		
		memberTreeSet.showAll();
		
		Member memberson2 = new Member(103, "손영조");  // class collection.Member cannot be cast to class java.lang.Comparable
		memberTreeSet.addMember(memberson2);		  //어떻게 비교해서 넣을지 구분이 안되었다.
		
		memberTreeSet.showAll();

	}

}
