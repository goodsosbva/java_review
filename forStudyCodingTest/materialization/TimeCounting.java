// �ð� ����
// �־��� �þȿ� 3�� �󸶳� ������ ī��Ʈ�ϴ� ����
package CodingTestWithJava.Greedy.materialization;

import java.util.Scanner;

public class TimeCounting {
	// 3�� �ִ��� üũ
	public static boolean chk(int i, int j, int k) {
		if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i <= h; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					if (chk(i, j, k) == true) {
						cnt += 1;
					}
				}
			}
		}
		System.out.println(cnt);
		

	}

}
