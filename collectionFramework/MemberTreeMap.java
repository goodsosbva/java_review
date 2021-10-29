package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;

import collectionFramework.Member;

public class MemberTreeMap {
private HashMap<Integer , Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new HashMap<Integer , Member>();  //Interger�� comparable�� ���� ������
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);  //member.getMemberId() �� int�� ���͵� Integer�� �ٲ� ����ڽ� wrapper Ŭ����
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
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
