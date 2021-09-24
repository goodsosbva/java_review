// �ս��� ����Ʈ
// ��ġ�� �־����� �� �̵��� �� �ִ� ����� ���� ����ϴ� ����

package CodingTestWithJava.Greedy.materialization;

import java.util.Scanner;

public class RoyalOfKnight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
		int[] dy = {2, 1, -1, -2, -2, -1, -1, 2};
		
		
		String input = sc.nextLine(); // �Է°��� Strig
		int r = input.charAt(1) - '0';
		int c = input.charAt(0) -'a' + 1;
		
		//System.out.println(r);
		//System.out.println(c);
		
		int res = 0;
		for(int i = 0; i < 8; i++) {
			r = r + dx[i];
			c = c + dy[i];
			if(r >= 1 && r < 9 && c >= 1 && c < 9) {
				res += 1;
				r = r - dx[i];
				c = c - dy[i];
			}
			else {
			r = r - dx[i];
			c = c - dy[i];
			}
		}
		System.out.println(res);
	}

}
