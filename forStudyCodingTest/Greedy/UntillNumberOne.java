// 1로 만들기 문제
// 다음 조건을 이용하여 1로만들기 1. n에서 1을 뺀다 2. n을 k로 나눈다 
// 두번째 연산은 n이로 k로 나누어 떨어질때만 사용 가능
// 이 두조건을 최소를 쓰는 횟수를 출력하기

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
