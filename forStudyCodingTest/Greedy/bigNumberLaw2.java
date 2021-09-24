// 큰 수의 법칙 문제
package CodingTestWithJava.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class bigNumberLaw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수
        
        int result = 0;
        
        while (true) {
        	for (int i = 0; i < k; i++) {
        		if (m == 0) {
        			break;
        		}
        		result += first;
        		m -= 1;
        	}
        	if (m == 0) {
        		break;
        		}
        	result += second;
        	m -= 1;
        }
        System.out.println("정답: " + result);
	}

}
