package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class efficientMonetaryComposition {
	
	public static long[] d = new long[100];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		Arrays.fill(d, 10001);
		// d[0] = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		d[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = arr[i]; j <= m; j++) {
				if(d[j - arr[i]] != 10001) {
					d[j] = Math.min(d[j], d[j - arr[i]] + 1);
				}
			}
		}
		System.out.println(d[m]);
		

	}

}
