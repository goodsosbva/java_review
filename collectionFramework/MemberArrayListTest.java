package collectionFramework;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberkwon = new Member(102, "������");
		Member memberson = new Member(103, "�����");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberkwon);
		memberArrayList.addMember(memberson);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberLee.getMemberId());
		
		memberArrayList.showAll();

	}

}
