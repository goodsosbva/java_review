package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		/*for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		Iterator<Member> iterator = treeset.iterator();   //iterator을 사용하는 방법.
		while( iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				treeset.remove(member);
				return true;
		}
	}	
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
		//System.out.println(arrayList);
	}
}
