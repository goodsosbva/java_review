package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer , Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer , Member>(); 
	}
	
	//hashmap�� ȸ���� �߰��ϴ� �ż���
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);  //key, value ������ �߰�
	}
	
	
	// �ؽ��ʿ� ȸ���� �����ϴ� �ż���
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {  // �ؽ��ʿ� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
			hashMap.remove(memberId);  // �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// iterator�� ����� ��ü ȸ���� ����ϴ� �ż���
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {  // ���� key�� �ִٸ�
			int Key = ir.next();  // key ���� �����ͼ�
			
			Member member = hashMap.get(Key);  // Ű�κ��� value ��������
			System.out.println(member);
		}
		
	}
}
