package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import collectionFramework.Member;

public class MemberHashSet {
	private HashSet<Member> hashset;
	
	public MemberHashSet() {
		hashset = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// haseset 에서는 get(i)를 쓸 수 없기 때문에
		/*for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		Iterator<Member> iterator = hashset.iterator();   //iterator을 사용하는 방법.
		while( iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				hashset.remove(member);
				return true;
		}
	}	
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashset) {
			System.out.println(member);
		}
		System.out.println();
		//System.out.println(arrayList);
	}

}
