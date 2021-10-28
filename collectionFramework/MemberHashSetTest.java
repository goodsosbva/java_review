package collectionFramework;

import collectionFramework.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberkwon = new Member(102, "권현성");
		Member memberson = new Member(103, "손흥민");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberkwon);
		memberHashSet.addMember(memberson);
		
		memberHashSet.showAll();
		
		Member memberson2 = new Member(104, "이정찬");  
		Member memberson3 = new Member(102, "김태경"); // 아이디 중복 추가
		memberHashSet.addMember(memberson2);
		memberHashSet.showAll();

	}

}
