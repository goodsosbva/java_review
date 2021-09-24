package CodingTestWithJava.Greedy;

import java.util.Scanner;

public class NumberCardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			
	        int minValue = 99999;
	        for(int j = 0; j < m; j++) {
	        	int a = sc.nextInt();
	        	minValue = Math.min(minValue, a);
	        }
	        result = Math.max(result, minValue);
		}
		System.out.println(result); // 최종 답안 출력
	}

}
