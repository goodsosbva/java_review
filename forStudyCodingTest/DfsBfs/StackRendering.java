package Dfs_Bfs;

import java.util.*;

public class StackRendering {
	
	

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
	       
		// ����(5) - ����(2) - ����(3) - ����(7) - ����() - ����(1) - ����(4) - ����()
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(1);
        s.push(4);
        s.pop();
        // ������ �ֻ�� ���Һ��� ���
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

	}

}
