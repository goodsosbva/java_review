package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;

import collectionFramework.Member;

public class MemberTreeMap {
private HashMap<Integer , Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new HashMap<Integer , Member>();  //Interger은 comparable로 구현 되있음
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);  //member.getMemberId() 가 int로 들어와도 Integer로 바뀜 오토박싱 wrapper 클래스
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int Key = ir.next();
			
			Member member = treeMap.get(Key);
			System.out.println(member);
		}
		
	}
}
