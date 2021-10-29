package collectionFramework;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberTreeMap =new MemberHashMap();
		
		Member memberLee = new Member(101, "이순신");
		Member memberkwon = new Member(102, "권현성");
		Member memberson = new Member(103, "손흥민");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberkwon);
		memberTreeMap.addMember(memberson);
		
		memberTreeMap.showAllMember();
		System.out.println("==============");
		
		//Member memberson2 = new Member(103, "이정찬");  // class collection.Member cannot be cast to class java.lang.Comparable
		//memberTreeMap.addMember(memberson2);				   //어떻게 비교해서 넣을지 구분이 안되었다.
		memberTreeMap.removeMember(103);				  
		
		memberTreeMap.showAllMember();

	}

}
