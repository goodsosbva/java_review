// 1�� ����� ����
// ���� ������ �̿��Ͽ� 1�θ���� 1. n���� 1�� ���� 2. n�� k�� ������ 
// �ι�° ������ n�̷� k�� ������ ���������� ��� ����
// �� �������� �ּҸ� ���� Ƚ���� ����ϱ�

package CodingTestWithJava.Greedy;

import java.util.Scanner;

public class UntillNumberOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cnt = 0;
		
		
		while (n != 1) {
			if (n % m == 0) {
				n = n / m;
				cnt += 1;
			}
			n -= 1;
			cnt += 1;
			if (n < m) {
				break;
			}
		}
		System.out.println(n + " " + cnt);
		while (n > 1) {
			n -= 1;
			cnt += 1;
		}
		System.out.println(cnt);

	}

}
