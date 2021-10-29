package collectionFramework;

public class MemberTreeMapTest {

	public static void main(String[] args) {
MemberTreeMap memberTreeMap =new MemberTreeMap();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberkwon = new Member(102, "������");
		Member memberson = new Member(103, "�����");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberkwon);
		memberTreeMap.addMember(memberson);
		
		memberTreeMap.showAllMember();
		System.out.println("==============");
		
		//Member memberson2 = new Member(103, "������");  // class collection.Member cannot be cast to class java.lang.Comparable
		//memberTreeMap.addMember(memberson2);				   //��� ���ؼ� ������ ������ �ȵǾ���.
		memberTreeMap.removeMember(101);				  
		
		memberTreeMap.showAllMember(); 

	}

}